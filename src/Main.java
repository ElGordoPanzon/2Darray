public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int col = 0; col < array[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < array.length; row++) {
                colSum += array[row][col];
            }
            System.out.println(colSum);
        }


    }

    private static void transpose(int[][] array) {
        int[][] transpose = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }
    }

}
