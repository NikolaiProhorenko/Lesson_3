import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  arrayPlus ();
       // shessBoard();
        arraySum ();

    }
    static void arrayPlus () {
        //Создать двухмерный массив из целых чисел.
        //С помощью циклов "пройти" по всему массиву и увеличить каждый
        //элемент на заданное число. Пусть число, на которое будет
        //увеличиваться каждый элемент, задается из консоли.
        int[][] symbol = {
                {5,5,2},
                {11,48,6},
                {16,14,4}};
            Scanner numbers = new Scanner(System.in);
            System.out.print("Enter how mach you want + :");
            int base = numbers.nextInt();
            numbers.close();
            for (int a = 0; a < symbol.length; a++ )
                {  for ( int b =0; b < symbol.length; b++)
                { symbol[a][b] += base;
                }}

            for (int a = 0; a < symbol.length; a++)
                { for (int b =0; b < symbol.length; b++)
                    System.out.println(symbol [a][b] + "");
                    System.out.println();
            }
    }
    static void shessBoard() {
        //Шахматная доска
        //Создать программу для раскраски шахматной доски с помощью цикла.
        //Создать двумерный массив String'ов 8х8. С помощью циклов задать
        //элементам циклам значения B(Black) или W(White).

        char[][] shess = new char[8][8];
        char[] symbol = {'W','B'};
        for (int xx = 0, num = 0 ; xx < shess.length;xx++)
        {
            for (int z = 0; z < shess[xx].length;z++)
            {
                shess[xx][z] = symbol[num];
                num = (num == 0) ? ++num : --num;
            }
        }
        System.out.println(Arrays.deepToString(shess));
    }

    static void arraySum () {
        //Создайте двумерный массив целых чисел. Выведите на консоль сумму
        //всех элементов массива.
        int[][] myArray = {
                {1, 2, 3},
                {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);
        int x = myArray.length;
        int sum = 0;
        scanner.close();

        for (int a = 0; a < x; a++) {
            for (int b = 0; b < x; b++)
                sum += myArray[a][b];
            System.out.println(sum);
            System.out.println();
        }
    }
}
