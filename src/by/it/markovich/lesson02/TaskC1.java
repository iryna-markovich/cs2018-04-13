package by.it.markovich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a = newScanner.nextInt();
        int b = newScanner.nextInt();
        int sum = a + b;
        System.out.println("Sum" + " " + "=" + " " + sum);
    }




}
