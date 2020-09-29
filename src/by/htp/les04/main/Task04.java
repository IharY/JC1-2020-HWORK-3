package by.htp.les04.main;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное). 1   2     3   ... n
                                                                             n n - 1 n - 2 ... 1
                                                                             1   2     3   ... n
                                                                          (  n n - 1 n - 2 ... 1 )
                                                                             .   .     .    .  .
                                                                             .   .     .    .  .
                                                                             n n - 1 n - 2 ... 1
 */

public class Task04 {
	public static void main(String[] args) {
		int[][] matrix = new int[6][6];

		System.out.println("Новая матрица: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i % 2 == 0) {

					matrix[i][j] = j + 1;
					System.out.print(matrix[i][j] + " ");

				} else {

					matrix[i][j] = matrix[0].length - j;
					System.out.print(matrix[i][j] + " ");

				}
			}
			System.out.println();
		}

	}
}
