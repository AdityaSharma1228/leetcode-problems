class RotateImage {
    public void rotate(int[][] matrix) {
        //tanspose
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Interchange
        for(int k=0; k<matrix.length; k++) {
            for(int l=0; l<matrix.length/2; l++) {
                int temp = matrix[k][l];
                matrix[k][l] = matrix[k][matrix.length-1-l];
                matrix[k][matrix.length-1-l] = temp;
            }
        }
    }
}