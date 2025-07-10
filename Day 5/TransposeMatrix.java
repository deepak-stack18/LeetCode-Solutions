class Solution {
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transposed = transpose(matrix);
        for(int i=0; i<transposed.length; i++){
            for(int j=0; j<transposed[0].length; j++){
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}