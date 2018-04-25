package by.it.markovich.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner newScanner = new Scanner(System.in);
        for (int x = 0; x < 20; x++) {
            int elem = newScanner.nextInt();
            arr.add(elem);
        }
        ArrayList<Integer> arrD3 = new ArrayList<Integer>();
        ArrayList<Integer> arrD2 = new ArrayList<Integer>();
        ArrayList<Integer> arrOther = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int j = arr.get(i);
            if (j % 3 == 0) {
                arrD3.add(j);
            }
            if (j % 2 == 0) {
                arrD2.add(j);
            } else if (j % 3 != 0) {
                arrOther.add(j);
            }
        }
        printList(arrD3);
        printList(arrD2);
        printList(arrOther);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) {
            System.out.println(aList);
        }
    }


}
