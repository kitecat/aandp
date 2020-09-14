import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        try {
            File f1 = new File("input.txt");
            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            List<Double> input = new ArrayList<Double>();
            try {
                while(rd.available() > 0) {
                    input.add(rd.readDouble());
                    System.out.println(input.get(input.size() - 1));
                }
            } catch (EOFException e) {
                rd.close();
            }

//            File f2 = new File("output.txt");
//            if (f2.exists()) {
//                f2.delete();
//            }
//            f2.createNewFile();
//
//            DataOutputStream wr =
//                    new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
//
//            double max = 100;
//            wr.writeDouble(max);
//            try {
//                while(true) {
//                    double number = rd.readDouble();
//                    if (number > max) {
//                        max = number;
//                    }
//                    wr.writeDouble(number);
////                    wr.writeDouble(max);
//                    System.out.println("Maximum " + max);
//                }
//            } catch (EOFException e) {
//                wr.flush();
//                wr.close();
//                rd.close();
//            }
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}