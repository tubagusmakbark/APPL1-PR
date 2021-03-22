import java.io.*;
import java.util.*;

public class PersonalityTest {

public static void main(String[] args) throws FileNotFoundException {

    boolean isFile = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input file name? ");
        String fileName = sc.next();
        File inputFile = new File(fileName);

    while (isFile == false) {    
        if (inputFile.exists()) {
            Scanner input = new Scanner(inputFile);
            isFile = true;
        }            
    }

    while(input.hasNextLine()) {

    }
}