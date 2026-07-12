class 2DMatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int high = row*col -1;
        int mid = 0;
        int midrow = 0;
        int midcol = 0;
        while(low<=high) {
            mid = (low+high)/2;
            midrow = mid/col;
            midcol = mid%col;
            if(matrix[midrow][midcol]==target) {
                return true;
            }
            else if(matrix[midrow][midcol]>target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}