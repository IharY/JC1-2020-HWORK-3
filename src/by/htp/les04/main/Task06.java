package by.htp.les04.main;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное). 1   1   1   ...  1  1  1
                                                                             1   0   0   ...  0  0  1
                                                                             1   0   0   ...  0  0  1
                                                                             .   .   .    .   .  .  .
                                                                          (  .   .   .    . . .  .  .  )
                                                                             .   .   .    .   .  .  .
                                                                             1   0   0   ...  0  0  1
                                                                             1   1   1   ...  1  1  1
 */

public class Task06 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];


        System.out.println("Новая матрица: ");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == matrix.length - 1 || j == matrix[0].length - 1 || i == 0 || j == 0) {
                    matrix[i][j] = 1;
                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

