package Week2.Copying_a_File;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.*;

public class CopyingAFile {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Enter The Name Of File(.txt): ");
                String filename;
                filename = new Scanner(System.in).nextLine();
                File fileObj = new File("src/Week2/Copying_a_File/" + filename + ".txt");
                Scanner exist = new Scanner(fileObj);
                while (exist.hasNextLine()) {
                    System.out.println(exist.nextLine());
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.print("File Does not exist\n");
            }
        }
    }
}
