package Project_for_Finals;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {


        try {
            File myFile = new File("Hii.txt");
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter myWriter = new FileWriter("Hii.txt");
            myWriter.write("Files in Java might be tricky, but it is fujkkkkkkkkkkkn enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
