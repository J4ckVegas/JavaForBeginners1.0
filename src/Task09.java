/* Произведите ввод данных с клавиатуры в массив,
а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. */

import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте длину массива: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int q = 0; q < n; q++) {
            System.out.print("Присвойте число элементу массива: ");
            arr[q] = scan.nextInt();
        }
        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "*2" + "=" + arr[i]*2);
        }
    }
}