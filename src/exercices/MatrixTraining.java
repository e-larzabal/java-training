public class MatrixTraining {

    /**
     * @param lines   height of the matrix, eg: 3
     * @param columns width of the matrix, eg: 2
     * @return an empty int matrix of lines and columns size,
     * eg: {{0, 0}, {0, 0}, {0, 0}}
     */
    public int[][] emptyIntMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        return matrix;
    }

    /**
     * @param lines   height of the matrix, eg: 2
     * @param columns width of the matrix, eg: 3
     * @return an empty string matrix of lines and columns size,
     * eg: {{null, null, null}, {null, null, null}}
     */
    public String[][] emptyStringMatrix(int lines, int columns) {
        String[][] matrix = new String[lines][columns];
        return matrix;
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return an int matrix with a, b and c arrays
     */
    public int[][] intMatrix(int[] a, int[] b, int[] c) {
        int maxColumsAColumnsB = (a.length>b.length) ? a.length : b.length;
        int matrixColumns = (maxColumsAColumnsB>c.length) ? maxColumsAColumnsB : c.length;
        int[][] matrix = new int[3][matrixColumns];

        for (int i=0;i<a.length;i++){
            matrix[0][i] = a[i];
        }
        for (int i=0;i<b.length;i++){
            matrix[1][i] = b[i];
        }
        for (int i=0;i<c.length;i++){
            matrix[2][i] = c[i];
        }

        return matrix;
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return a String matrix with a, b and c arrays
     */
    public String[][] stringMatrix(String[] a, String[] b, String[] c) {
        int maxColumsAColumnsB = (a.length>b.length) ? a.length : b.length;
        int matrixColumns = (maxColumsAColumnsB>c.length) ? maxColumsAColumnsB : c.length;
        String[][] matrix = new String[3][matrixColumns];

        for (int i=0;i<a.length;i++){
            matrix[0][i] = a[i];
        }
        for (int i=0;i<b.length;i++){
            matrix[1][i] = b[i];
        }
        for (int i=0;i<c.length;i++){
            matrix[2][i] = c[i];
        }

        return matrix;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix lines, eg: 3
     */
    public int height(int[][] matrix) {
        return matrix.length;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix columns, eg: 2
     */
    public int width(int[][] matrix) {
        if ( matrix.length > 0 ) {
            return matrix[0].length;
        } else {
            return 0;
        }
    }

    /**
     * @param matrix, eg: {{3, 4, 5}, {6, 7, 8}}
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return value in matrix at line and column, eg: 6
     */
    public int valueAtPosition(int[][] matrix, int line, int column) {
        if ( line>=0 && column>=0 && line<matrix.length && column<matrix[0].length) {
            return matrix[line][column];
        } else {
            return -1;
        }
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {8, 5, 6}}
     * @param value,  eg: 4
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return the matrix with the value replaced at line and column,
     * eg: {{1, 2, 3}, {4, 5, 6}}
     */
    public int[][] replace(int[][] matrix, int value, int line, int column) {
        if ( line>=0 && column>=0 && line<matrix.length && column<matrix[0].length) {
            matrix[line][column] = value;
        }
        return matrix;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return sum of matrix values, eg: 21
     */
    public int sum(int[][] matrix) {
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @param search, eg: 5
     * @return if matrix contains searched value, eg: true
     */
    public boolean contains(int[][] matrix, int search) {
        boolean finded = false;
        int iMax = matrix.length;
        int jMax = matrix[0].length;
        int i=0;
        int j=0;

        while ( !finded && i<iMax ) {
            if ( matrix[i][j] == search) { finded = true; }

            j++; // next column
            if ( j>=jMax) {
                i++; // next line
                j=0; // first column
            }
        }

        return finded;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return how many even numbers are in matrix, eg: 3
     */
    public int countEvens(int[][] matrix) {
        int countEvenValues = 0;

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if ( matrix[i][j]%2 == 0 ) { countEvenValues++; }
            }
        }

        return countEvenValues;
    }

    /**
     * @param matrix, eg: {{'d', 'b', 'a'}, {'a', 'd', 'a'}}
     * @param search, eg: 'a'
     * @return the number of character occurrences in matrix, eg: 3
     */
    public int occurrences(char[][] matrix, char search) {
        int countOccur = 0;

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if ( matrix[i][j] == search ) { countOccur++; }
            }
        }

        return countOccur;
    }
}
