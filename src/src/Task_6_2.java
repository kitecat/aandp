import java.io.*;

public class Task_6_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("MyFile2.txt"));
            int lineCount = 0; // счетчик строк
            String s;
            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);

                //Разделение строки на слова
                String[] splitted = s.split("\\s+");
                for (String word: splitted) {
                    //Проверка слова на равенство первой и последней буквы
                    if ((word.charAt(word.length() - 1)) == (word.charAt(0))) {
                        out.write(word);
                    }
                }
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}