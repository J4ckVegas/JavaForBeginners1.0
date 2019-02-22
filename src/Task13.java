/*Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длинной.*/
import java.util.Scanner;
public class Task13 {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст №1: ");
        String str1 = scan.nextLine();
        System.out.print("Введите текст №2: ");
        String str2 = scan.nextLine();

        if (str1.length()>str2.length()) {
            System.out.println("Вывод строки с наибольшой длинной (строка №1): " + str1);
        }
        else if (str1.length()<str2.length()) {
            System.out.println("Вывод строки с наибольшой длинной (строка №2): " + str2);
        }
        else {
        System.out.println("Строки одинаковой длинны.");
        }
    }
}