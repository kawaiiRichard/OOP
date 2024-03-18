public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new double[rows][columns];
    }

    public void setValue(int i, int j, double value) {
        matrix[i][j] = value;
    }

    public void multiplyByScalar(double scalar) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setValue(i, j, this.matrix[i][j] * scalar);
            }
        }

        System.out.println("Результат умножения матрицы на скаляр: ");
        result.printMatrix();
    }

    public void multiply(Matrix other) {
        Matrix result = new Matrix(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }

        System.out.println("Результат умножения матрицы: ");
        result.printMatrix();
    }

    public void printMatrix() {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setValue(0, 0, 1);
        matrix1.setValue(0, 1, 2);
        matrix1.setValue(1, 0, 3);
        matrix1.setValue(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(0, 0, 5);
        matrix2.setValue(0, 1, 6);
        matrix2.setValue(1, 0, 7);
        matrix2.setValue(1, 1, 8);

        System.out.println("Первая матрица: ");
        matrix1.printMatrix();
        System.out.println();

        System.out.println("Вторая матрица: ");
        matrix2.printMatrix();
        System.out.println();

        matrix1.multiplyByScalar(8);
        System.out.println();

        matrix1.multiply(matrix2);
    }
}
