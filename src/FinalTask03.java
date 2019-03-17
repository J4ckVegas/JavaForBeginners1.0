/*Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.*/

import java.util.Scanner;
public class FinalTask03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текущий курс доллара: ");
        double usd = scan.nextDouble();
        System.out.print("Введите количество рублей для конвертации: ");
        double rur = scan.nextDouble();
        double res = (rur/usd);
        System.out.println(rur + "рублей =" + res + "долларов");
    }
}