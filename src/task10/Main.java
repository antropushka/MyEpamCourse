package task10;

public class Main {
    public static void main(String args[]) {

        int n = 10;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[j].length - j;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}