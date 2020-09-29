package by.htp.les04.main;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное). 0   0   0   ...  0  0  1
                                                                             0   0   0   ...  0  2  0
                                                                             0   0   0   ...  3  0  0
                                                                             .   .   .    .   .  .  .
                                                                          (  .   .   .    . . .  .  .  )
                                                                             .   .   .    .   .  .  .
                                                                             0 n - 1 0   ...  0  0  0
                                                                             n   0   0   ...  0  0  0
 */

public class Task05 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        System.out.println();
        System.out.println("Новая матрица: ");
        for (int i = 0; i < matrix.length; i++){
            matrix[i][matrix[0].length - i] = i + 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
