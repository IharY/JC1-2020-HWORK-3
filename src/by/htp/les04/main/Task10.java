package by.htp.les04.main;

/*
Найти положительные элементы главной диагонали квадратной матрицы
 */

import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[][] matrix = new int[5][5];

		System.out.println("Исходная матрица:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = rn.nextInt(100) - 50;
				System.out.print(matrix[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Положительные элементы на главной диагонали:");
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] > 0) {
				System.out.println(matrix[i][i]);

			}

		}

	}
}
