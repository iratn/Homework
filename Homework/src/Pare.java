import java.util.Scanner;
public class Pare {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите целое число:");
            int a = in.nextInt();
            if (a % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Не четное");
            }
        } catch (Exception e) {
            System.out.println("Неверные данные!");
        }
    }
}
