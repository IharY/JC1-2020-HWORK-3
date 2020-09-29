package by.htp.les04.main;

/*
Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран  саму матрицу и номер строк, в
которых число 5 встречается три и более раз.
 */

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random rn = new Random();
        int[][] matrix = new int[10][20];
        int[] mas = new int[10];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rn.nextInt(15);
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5) {
                    mas[i]++;
                }

            }

        }
        System.out.println();
        System.out.println("Номера строк:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= 3) {
                System.out.print(i + " ");
            }
        }


    }
}
