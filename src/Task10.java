/* Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. */

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте длину массива: ");
        int n = scan.nextInt();
        System.out.print("Задайте ширину массива: ");
        int l = scan.nextInt();
        int arr[][] = new int[n][l];
        int q, h;

        for (q = 0; q < n; q++) {
            for (h = 0; h < l; h++) {
                System.out.print("Присвойте число элементу массива [" + q +"]["+ h + "]: ");
                arr[q][h] = scan.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[0][i] + "*3" + "=" + arr[0][i]*3);
        }
    }
}