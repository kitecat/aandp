import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Good implements Serializable {
    String name; // название товара
    String manufacturer; // производитель
    int count; // количество единиц
    int price; // цена

    Good(String name, String manufacturer, int count, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.count = count;
        this.price = price;
    }

    public String getDataString() {
        return name + ", " + manufacturer + ", " + count + ", " + price;
    }
}

public class Task2_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Good> goodsArray = new ArrayList<>();
        goodsArray.add(new Good("Anne Pro 2", "China", 123, 5000));
        goodsArray.add(new Good("G302", "Logitech", 555, 400));
        goodsArray.add(new Good("Pure Base 500", "be quiet", 777, 8000));
        goodsArray.add(new Good("XZ1 compact", "Sony", 33, 8000));
        goodsArray.add(new Good("OnePlus 3T", "OnePlus", 1, 8000));
        goodsArray.add(new Good("Кактус", "Россия", 9, 200));

        Scanner sc = new Scanner(System.in, "cp1251");
        // создается файл на диске
        File f = new File("Task2InputSer");
        f.createNewFile();
        // -------------ЗАПИСЬ ОБЪЕКТА В ФАЙЛ-------------
        // Создается поток для записи объекта
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(goodsArray);
        // Дописывается информация и закрывается файловый поток
        oos.flush();
        oos.close();
        // -------------ЧТЕНИЕ ОБЪЕКТА ИЗ ФАЙЛА-------------
        // Создается поток для чтения объекта из файла

        System.out.print("Сколько строк надо записать в файл? \n =>");
        int count = sc.nextInt();
        sc.nextLine(); // очистка буфера после ввода числа

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream oin = new ObjectInputStream(fis);
        ArrayList<Good> readGoodsArray = (ArrayList<Good>) oin.readObject();

        ArrayList<Good> selectedGoods = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < readGoodsArray.size() && j < count) {
            int price = readGoodsArray.get(i).price;
            if (price > 1000) {
                System.out.println(readGoodsArray.get(i).getDataString());
                selectedGoods.add(readGoodsArray.get(i));
                j++;
            }
        }
        File output = new File("Task2OutputSer");
        fos = new FileOutputStream(output);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(selectedGoods);
        // Дописывается информация и закрывается файловый поток
        oos.flush();
        oos.close();
    }
}
