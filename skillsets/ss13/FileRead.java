import java.io.*;

public class FileRead
{
   public static void main(String [] args)
   {
      String fileName = "filewrite.txt";

      String line = null;

      try {
         FileReader fileReader = new FileReader(fileName);
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         while((line = bufferedReader.readLine()) != null)
         {
            System.out.println(line);
         }
        
         bufferedReader.close();
      }
      catch(FileNotFoundException ex)
      {
         System.out.println("Unable to open file '" + fileName + "'");
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }

   }
}