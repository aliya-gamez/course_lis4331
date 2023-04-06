import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class distanceCalculator implements ActionListener
{
    public static void main(String[] args)
    {
        distanceCalculator gui = new distanceCalculator();
    }      

    //onscreen components stored as fields
    private JFrame frame;
    private JTextField legA;
    private JTextField legB;
    private JLabel distanceLabel;
    private JButton computeButton;

    //round to two decimal
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public distanceCalculator() {
        // set up components
        legA = new JTextField(5);
        legB = new JTextField(5);
        distanceLabel = new JLabel("Compute Distance Leg C.");
        computeButton = new JButton("Compute");

        // attach GUI as event listener to Compute button
        computeButton.addActionListener(this);

        // layout
        JPanel north = new JPanel(new GridLayout(2, 2));
        north.add(new JLabel("Leg A: "));
        north.add(legA);
        north.add(new JLabel("Leg B: "));
        north.add(legB);

        // overall frame
        frame = new JFrame("Distance Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(north, BorderLayout.NORTH);
        frame.add(distanceLabel, BorderLayout.CENTER);
        frame.add(computeButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    // Handles Clicks
    public void actionPerformed(ActionEvent event) {
        // read height/weight info from text fields
        String legA_text = legA.getText();
        double legA = Double.parseDouble(legA_text);
        String legB_text = legB.getText();
        double legB = Double.parseDouble(legB_text);

        // compute BMI and display it onscreen
        double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        distanceLabel.setText("Leg C: " + df.format(hypotenuse));
    }
}
