import java.io.*;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        try {
            File f1 = new File("input.txt");
            File f2 = new File("output.txt");
            f2.createNewFile();

            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            DataOutputStream wr =
                    new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            double max = rd.readDouble();
            wr.writeDouble(max);
            try {
                while(true) {
                    double number = rd.readDouble();
                    if (number > max) {
                        max = number;
                    }
                    wr.writeDouble(number);
//                    wr.writeDouble(max);
                    System.out.println("Maximum " + max);
                }
            } catch (EOFException e) {
                wr.flush();
                wr.close();
                rd.close();
            }
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}