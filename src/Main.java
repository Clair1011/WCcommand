import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    // wc command
    public static void main(String[] args)  {
        String filename = JOptionPane.showInputDialog("Filename: ");
        File f = new File(filename);
        int line_count = 0;
        int word_count = 0;
        int char_count = 0;
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                line_count ++;
                String line = scanner.nextLine();
                String[] line_arr = line.split(" ");
                for (String word : line_arr) {
                    word_count++;
                }
                char_count += line.length();

            }
            scanner.close();

            System.out.println("Line count is: " + line_count);
            System.out.println("Word count is: " + word_count);
            System.out.println("Character count is: "+ char_count);
        } catch (FileNotFoundException e) {
            System.out.println(f + " not found.");
        }
    }
}




















