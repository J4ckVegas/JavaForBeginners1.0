/*Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран.
Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.*/
import java.util.Scanner;

public class FinalTask01 {

    public static int BinaryToInt(int binaryNumber){

        int z = 0;
        int p = 0;
        while(true){
            if(binaryNumber == 0){
                break;
            } else {
                int temp = binaryNumber%10;
                z += temp*Math.pow(2, p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
        return z;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int X = scan.nextInt();
        System.out.println("Результат: " + BinaryToInt(X));

    }
}