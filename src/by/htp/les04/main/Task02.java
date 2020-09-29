package by.htp.les04.main;

/*
Дана матрица. Вывести k-ю стриоку и p-й столбец матрицы.
 */

public class Task02 {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{12, 13, 14, 5, 11},
                {18, 2, 19, 11, 13},
                {10, 16, 12, 14, 7},
                {19, 9, 21, 10, 17},
                {11, 12, 22, 15, 9}};
        int k = 2;
        int p = 1;

        System.out.println("Исходная матрица:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("k-ая строка");
        for (int j = 0; j < matrix[matrix[0].length].length; j++) {

            System.out.print(matrix[k - 1][j] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("p-й столбец");
        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i][p - 1] + " ");
        }

    }
}
