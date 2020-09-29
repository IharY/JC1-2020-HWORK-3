package by.htp.les04.main;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное). x1    x2    x3    ...    xn
                                                                             x1^2  x2^2  x3^2  ...    xn^2
                                                                             x1^3  x2^3  x3^3  ...    xn^3
                                                                           ( .     .     .      .     .   )
                                                                             .     .     .      .  .  .
                                                                             .     .     .      .     .
                                                                             x1^n  x2^n  x3^n  ...    xn^n

 */

import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
        Random rn = new Random();
        double [][] matrix = new double[6][6];
        double [] mas = new double[matrix[0].length];

        for(int i = 0; i < mas.length; i++){
            mas[i] = rn.nextInt(10) ;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]  = mas[j];

                System.out.print(Math.pow(matrix[i][j], i + 1) + "\t");

            }
            System.out.println();
        }

        System.out.println();

    }
}
