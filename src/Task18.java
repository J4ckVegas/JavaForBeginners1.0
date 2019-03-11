/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.*/

import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String s;
        int i, j;
        i = j = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("sample3.txt"))) {
            while((s = br.readLine())!= null){
                System.out.print(s + "\n");
                i += 1;
            }
            System.out.println("Кол-во строк: " + i);
            String str;
            BufferedReader brd = new BufferedReader (new InputStreamReader(System.in));
            try(FileWriter fw = new FileWriter("sample3.txt", false)) {
                for (int k = 0; k < i; k++) {
                    System.out.print("Введите текст: ");
                    str = brd.readLine();
                    str += "\r\n";
                    fw.write(str);
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage()); }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage()); }
    }
}