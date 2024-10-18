class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean test = false;
        int L = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < L; i++) {
            if (matrix[i][0] == 0) {
                test = true;
            }
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < L; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }
        
        if (test) {
            for (int i = 0; i < L; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}