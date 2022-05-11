import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
