package by.htp.les04.main;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц
равно номеру столбца
 */

public class Task12 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] matrix = new int[m][n];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if(j <= i) {
                    matrix[i][j] = 1;
                }
            }

        }
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
