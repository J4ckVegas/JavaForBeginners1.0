/* Необходимо вывести на экран таблицу умножения для введённого пользователем числа. Использовать циклы запрещено. */
import java.util.Scanner;
public class Task05 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.println(num + " * "+ 1 +" = "+num*1);
        System.out.println(num + " * "+ 2 +" = "+num*2);
        System.out.println(num + " * "+ 3 +" = "+num*3);
        System.out.println(num + " * "+ 4 +" = "+num*4);
        System.out.println(num + " * "+ 5 +" = "+num*5);
        System.out.println(num + " * "+ 6 +" = "+num*6);
        System.out.println(num + " * "+ 7 +" = "+num*7);
        System.out.println(num + " * "+ 8 +" = "+num*8);
        System.out.println(num + " * "+ 9 +" = "+num*9);
        System.out.println(num + " * "+ 10 +" = "+num*10);
    }
}