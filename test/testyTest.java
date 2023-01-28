package Stigespill.test;

public class testyTest {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int counter = 100;
        int value = 10;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i%2==0) {
                    matrix[i][j] = counter--;
                } else {
                    matrix[i][j] = value++;
                }
            }
            if(i%2==0) {
                counter -= 10;
                value = counter - 9;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
