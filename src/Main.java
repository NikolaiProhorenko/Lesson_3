import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Numbers();
  //RamdommNumber();
    }

    static void Numbers() {

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
        }
        MyNumber.close();
    }

     public void RamdommNumber()
    //Создайте и заполните массив случайным числами и выведете
    //          максимальное, минимальное и среднее значение.
    //          Для генерации случайного числа используйте метод Math.random().
    //          Пусть будет возможность создавать массив произвольного
    //          размера. Пусть размер массива вводится с консоли.

    {
   //    System.out.print("Enter number");
  //     Scanner number = new Scanner(System.in);
  //      int[]  number = new int[];

    }

}