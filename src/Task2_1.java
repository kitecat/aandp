import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        String[] goods = {
                "Anne Pro 2, China, 123, 5000",
                "G302, Logitech, 555, 400",
                "Pure Base 500, be quiet, 777, 8000",
                "XZ1 compact, Sony, 33, 8000",
                "OnePlus 3T, OnePlus, 1, 8000",
                "Кактус, Россия, 9, 200"
        };
        int goodsCount = goods.length;
        try {
            File f1 = new File("Task2Input.txt");
            f1.createNewFile();

            RandomAccessFile rf = new RandomAccessFile(f1, "rw"); // чтение/запись
            rf.setLength(0);

            // Записать товары в файл
            for (int i = 0; i < goodsCount; i++) {
                rf.writeUTF(goods[i]);
            }
            rf.close();

            Scanner sc = new Scanner(System.in, "cp1251");
            System.out.print("Сколько строк надо записать в файл? \n =>");
            int count = sc.nextInt();
            sc.nextLine(); // очистка буфера после ввода числа
            String[] selectedGoods = new String[count];

            // Открыть файл для чтения "r"
            rf = new RandomAccessFile(f1, "r");
            // Вывод строк из файла на экран
            rf.seek(0); // перевести указатель в начало файла (на первое слово)
            int i = 0;
            int j = 0;
            while (j < count && i < goodsCount) {
                String goodString = rf.readUTF();
                String[] goodArray = goodString.split(", ");
                int price = Integer.parseInt(goodArray[3]);
                if (price > 1000) {
                    System.out.println(goodString);
                    selectedGoods[j] = goodString;
                    j++;
                }
                i++;
            }
            rf.close();

            File f2 = new File("Task2Output.txt");
            f2.createNewFile();
            rf = new RandomAccessFile(f2, "rw"); // чтение/запись
            rf.setLength(0);

            // Записать товары в файл
            for (String good: selectedGoods) {
                if (good != null)
                    rf.writeUTF(good);
            }

            rf.close();
        } catch (IOException e) {
            System.out.println("End of file " + e);
        }
    }
}
