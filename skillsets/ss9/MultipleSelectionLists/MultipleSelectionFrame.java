import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
    private JList<String> musicJList; //list to hold ____ names
    private JList copyJList; // list to copy list names into
    private JButton copyJButton; // button to copy selected names
    private static final String[] musicGenres = {"Rock", "Jazz", "Electronic Dance Music", "Dubstep", "Techno", "Rhythm & Blues", "Hiphop/Rap", "Indie Rock", "Post-hardcore", "Country"};

    //MultipleSelectionFrmae Constructor
    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout()); //set frame layout
        musicJList = new JList<>( musicGenres ); //holds name of all music genres
        musicJList.setVisibleRowCount(5);
        musicJList.setFixedCellHeight(15);
        musicJList.setFixedCellWidth(140);
        musicJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        add( new JScrollPane(musicJList));
        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(
            new ActionListener() {
                public void actionPerformed( ActionEvent event) {
                    copyJList.setListData(musicJList.getSelectedValues());
                }
            }
        );

        add(copyJButton);
        copyJList = new JList();

        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellHeight(15);
        copyJList.setFixedCellWidth(140);
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        add(new JScrollPane(copyJList));
    }

}