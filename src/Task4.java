/* Ввести с консоли число в бинарном формате.
Перевести его в int и вывести на экран. */
import java.util.Scanner;
public class Task4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String binary = scan.next();
        int Y = Integer.parseInt(binary, 2);
        System.out.println("Результат: " + Y);
    }
}