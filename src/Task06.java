/* Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры X,Y,Z
2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно" */
import java.util.Scanner;
public class Task06 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение для X, Y, Z: ");
        double X = scan.nextDouble(), Y = scan.nextDouble(), Z = scan.nextDouble();
        double j = (X + Y + Z) / 3;
        System.out.println ("Вывод на экран среднего арифметического = " + j);
        int P = (int) j / 2;
        if (P > 3) { System.out.println("Программа выполнена корректно"); }
    }
}