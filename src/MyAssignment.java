import java.io.*;
import java.util.Scanner;


// 1.Read data from CSV file using JAVA input/output Stream

public class MyAssignment {
    public static void main(String[] args) {
        // Reading a csv file using java streams
        String filename = "E:\\username.csv";
        File file = new File(filename);

        try {
            Scanner inputStream = new Scanner(file);// in case file not found
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                System.out.print(data);
            }
            inputStream.close();
        }

        catch (FileNotFoundException e) {

            e.printStackTrace();
        }


    }
}
