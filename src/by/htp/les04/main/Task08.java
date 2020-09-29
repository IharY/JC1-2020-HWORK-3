package by.htp.les04.main;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное). 1    2    3    ...  n - 2   n - 1   n
                                                                             2    3    4    ...  n - 1     n     0
                                                                             3    4    5    ...    n       0     0
                                                                             .    .    .     .     .       .     .
                                                                          (  .    .    .     .  .  .       .     .  )
                                                                             .    .    .     .     .       .     .
                                                                          n - 1   n    0    ...    0       0     0
                                                                             n    0    0    ...    0       0     0
 */

public class Task08 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        //увеличиваем размер массива, чтобы не столкнуться с ошибкой выхода за его пределы
        int [] mas = new int [matrix.length + 5];
        //Pointer нужен для того чтобы двигатся по вспомогательному массиву вправо
        int pointer = 0;

        //заполняем вспомогательный массив
        for (int i = 0; i < mas.length; i++) {
            if(i < matrix.length) {
                mas[i] = i + 1;
            }else{
                mas[i] = 0;
            }
        }

        System.out.println("Исходная матрица:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Новая матрица: ");

        //выплныяем задание и выводим массив
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(pointer < 5){
                    matrix[i][j] = mas[j + pointer];
                    System.out.print(matrix[i][j] + " ");
                }

            }
            pointer++;
            System.out.println();

        }

    }
}
