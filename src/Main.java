import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    numbers();
    deliteNumber();
    }

    static void numbers() {

        //Создайте массив целых чисел. Напишете программу, которая выводит
        //сообщение о том, входит ли заданное число в массив или нет. Пусть
        //число для поиска задается с консоли (класс Scanner)
        Scanner MyNumber = new Scanner(System.in);

           System.out.print("Enter number: ");
        int[] number = new int[] {1,3,5,7,9};
        int Number = MyNumber.nextInt();
        int index = 0;
        int ArrayElement;
        int place=0;

        for (index = 0; index < number.length; index++) {
            ArrayElement = number[index];
            if (ArrayElement == Number)
                place++;}
        if (place>0){
            System.out.println("Число входит в массив");}
        else {
            System.out.println("Число не входит в массив");
            MyNumber.close();
        }
    }

      static void deliteNumber() {
         //Создайте и заполните массив случайным числами и выведете
         //          максимальное, минимальное и среднее значение.
         //          Для генерации случайного числа используйте метод Math.random().
         //          Пусть будет возможность создавать массив произвольного
         //          размера. Пусть размер массива вводится с консоли.

         Scanner numbers = new Scanner(System.in);
         System.out.print("Введите размер массива :");
         int base = numbers.nextInt();
         int[] array = new int[base];

         System.out.println("Введите элементы цикла :");
         for (int a = 0; a < base; a++)
         {
             array[a] = numbers.nextInt();
         }
         System.out.print("Введите элемент который хотите удалить :");
         int deliteNumber = numbers.nextInt();
         int newBase = 0;
         for (int a = 0; a < base; a++)
         {
             if (array[a] != deliteNumber)
             {
                 array[newBase++] = array[a];
             }
         }
         if (newBase == 0)
         {
             System.out.print("Массив не пустой");
         } else
         {
             System.out.print("Массив без числа равен :");
             for (int a = 0; a < newBase; a++)
             {
                 System.out.print(array[a] + " ");
                 numbers.close();
             }
         }

     }

}