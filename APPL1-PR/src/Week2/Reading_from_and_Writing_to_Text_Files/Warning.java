package Week2.Reading_from_and_Writing_to_Text_Files;

// ****************************************************************************
// Warning.java
//
// Reads student data from a text file and writes data to another text file.
// ****************************************************************************
import java.util.Scanner;
import java.io.*;

public class Warning {

    // --------------------------------------------------------------------
    // Reads student data (name, semester hours, quality points) from a
    // text file, computes the GPA, then writes data to another file
    // if the student is placed on academic warning.
    // --------------------------------------------------------------------
    public static void main(String[] args) {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String name, inputName = "students.dat";
        String outputName = "warning.dat";
        try {
            // Set up scanner to input file
            Scanner scan = new Scanner(new File("src\\Week2\\Reading_from_and_Writing_to_Text_Files\\" + inputName));
            // Set up the output file stream
            PrintWriter outFile = new PrintWriter("src\\Week2\\Reading_from_and_Writing_to_Text_Files\\" + outputName);
            // Print a header to the output file
            outFile.println("\n++++++++Students on Academic Warning++++++++\n");
            // Process the input file, one token at a time

            while (scan.hasNextLine()) {
                // Get the credit hours and quality points and
                // determine if the student is on warning. If so,
                // write the student data to the output file.
                String[] line = scan.nextLine().split(" ", 0);
                name = line[0];
                creditHrs = Integer.parseInt(line[1]);
                qualityPts = Double.parseDouble(line[2]);
                gpa = qualityPts / creditHrs;
                if (((gpa < 1.5) && (creditHrs < 30)) || ((gpa < 1.75) && (creditHrs < 60)) || (gpa < 2.0)) {
                    outFile.println(name + " " + creditHrs + " " + gpa);
                }
            }
            // Close output file
            outFile.close();
            scan.close();
        } catch (FileNotFoundException exception) {
            System.out.println("The file " + inputName + " was not found.");
        } catch (NumberFormatException e) {
            System.out.println("Format error in input file: " + e);
        }
    }
}
