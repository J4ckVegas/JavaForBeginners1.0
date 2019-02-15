/* Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. */

import java.util.Scanner;
class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int t, i;

        System.out.print("Введите значения для двумерного массива: ");
        arr[0][0] = scan.nextInt();
        arr[0][1] = scan.nextInt();
        arr[1][0] = scan.nextInt();
        arr[1][1] = scan.nextInt();

        for (t=0; t<2; ++t) {
            for (i=0; i<arr[t].length; ++i) {
                System.out.print(arr[t][i] + " ");
            }
            System.out.println();
            }
        }
    }