import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task5_2 {
    public static void main(String[] args) {
        try {
            List<Double> inputArray = new ArrayList<>();
            File inputFile = new File("input.txt");
            BufferedReader inputReader
                    = new BufferedReader(new FileReader(inputFile));
            String temp;
            while ((temp = inputReader.readLine()) != null) {
                inputArray.add(Double.parseDouble(temp));
            }

            double max = inputArray.get(0);
            for (double input : inputArray) {
                if (input > max)
                    max = input;
            }

            File outputFile = new File("output.txt");
            if (outputFile.exists()) {
                outputFile.delete();
            }
            outputFile.createNewFile();
            DataOutputStream outputStream
                    = new DataOutputStream(new FileOutputStream(outputFile.getAbsolutePath()));
            for (double b : inputArray) {
                if (b > 0)
                    outputStream.writeUTF(String.valueOf(b));
            }
            outputStream.writeUTF(String.valueOf(max));
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}