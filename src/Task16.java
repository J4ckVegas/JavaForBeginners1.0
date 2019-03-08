/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt */
import java.io.*;
import java.util.Scanner;

public class Task16 {

        public static void main(String[] args) throws Exception {
            FileReader fr = new FileReader( "sample1.txt" );
            Scanner scan2 = new Scanner(fr);
            while (scan2.hasNextLine()) {
                System.out.println(scan2.nextLine());}
            fr.close();
        }
    }
