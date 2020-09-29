package by.htp.les04.main;

/*
дана матрица размера mxn вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слево
на право, третья строка справа на лево
 */

public class Task03 {
    public static void main(String[] args) {


        int matrix[][] = new int[][]{
                {12, 13, 14, 5, 11},
                {18, 2, 19, 11, 13},
                {10, 16, 12, 14, 7},
                {19, 9, 21, 10, 17},
                {11, 12, 22, 15, 9}};

        System.out.println("Исходная матрица:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Новая матрица: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {

                    System.out.print(matrix[i][matrix[0].length - 1 - j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                    //System.out.print(matrix[i][matrix[matrix.length - 1].length - 1 - j] + " ");
                }
            }
            System.out.println();
        }
    }
}
