package by.it.markovich.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        /*
        if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) {
            System.out.println((b-1) * 31 + a - b);
        } else if (b == 2) {
            System.out.println((b-1) * 28 + a);
        } else {
            System.out.println((b-1) * 30 + a);
        }
        */
        switch (b){
            case 1:
                System.out.println((b-1) * 31 + a);
                break;
            case 2:
                System.out.println((b-1) * 28 + a + 1);
                break;
            case 3:
                System.out.println((b-1) * 31 + a - 3);
                break;
            case 4:
                System.out.println((b-1) * 30 + a +1);
                break;
            case 5:
                System.out.println((b-1) * 31 + a - 3);
                break;
            case 6:
                System.out.println((b-1) * 30 + a +2);
                break;
            case 7:
                System.out.println((b-1) * 31 + a - 4);
                break;
            case 8:
                System.out.println((b-1) * 31 + a - 5);
                break;
            case 9:
                System.out.println((b-1) * 30 + a + 3);
                break;
            case 10:
                System.out.println((b-1) * 31 + a - 6);
                break;
            case 11:
                System.out.println((b-1) * 30 + a + 4);
                break;
            case 12:
                System.out.println((b-1) * 31 + a - 7);
                break;
        }
    }
}
