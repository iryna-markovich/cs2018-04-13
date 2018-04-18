package by.it.markovich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int i = newScanner.nextInt();
        int j = newScanner.nextInt();
        int sum = i + j;
        String sumBinary = Integer.toBinaryString(sum);
        String sumHex = Integer.toHexString(sum);
        String sumOctal = Integer.toOctalString(sum);
        System.out.println("DEC:" + i + "+" + j + "=" + sum);
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(j) + "=" + sumBinary);
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(j) + "=" + sumHex);
        System.out.println("OCT:" + Integer.toOctalString(i) + "+" + Integer.toOctalString(j) + "=" + sumOctal);
    }

}
