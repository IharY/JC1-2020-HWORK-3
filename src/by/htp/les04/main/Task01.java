package by.htp.les04.main;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на главной диагонали.
 */

public class Task01 {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{2, 3, 4}, {8, 2, 9}, {10, 6, 2}};

        System.out.println("Исходная матрица:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Числа на главной диагонали");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");

        }
    }
}
