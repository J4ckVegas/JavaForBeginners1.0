/*
Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры X,Y,Z
2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
import java.util.Scanner;
public class Task4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите значение для X: "); int X = scan.nextInt();
        System.out.print("Введите значение для Y: "); int Y = scan.nextInt();
        System.out.print("Введите значение для Z: "); int Z = scan.nextInt();

        System.out.println ("Вывод на экран среднего арифметического = " + (X + Y + Z) / 3.0);
        System.out.println("Деление среднего арифметического на 2 без остатка = " + (X + Y + Z)/3/2);
    }
}