import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 3;

    public static void main(String[] args) {

        int[][] matrix = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }

        int angle;
        Scanner scanner = new Scanner(System.in);

        printMatrix(matrix);

        System.out.print("Введите угол поворота матрицы (90,180,270): ");
        angle = scanner.nextInt();

        int[][] rotatedMatrix = rotateMatrix(matrix, angle);

        if (angle == 90 || angle == 180 || angle == 270 || angle == 360) {
            System.out.println("Поворот матрицы на " + angle);
            printMatrix(rotatedMatrix);
        }
    }

    private static void printMatrix(int[][] mat) {
        System.out.println("Matrix = ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateRight90(int[][] mat) {
        int[][] newMatrix = new int[SIZE][SIZE];
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                newMatrix[c][SIZE - 1 - r] = mat[r][c];
            }
        }
        return newMatrix;
    }

    public static int[][] rotateMatrix(int[][] mat, int angle) {
        int[][] rotateMatrix = new int[SIZE][SIZE];
        if (angle == 90) {
            rotateMatrix = rotateRight90(mat);
        } else if (angle == 180) {
            rotateMatrix = rotateRight180(mat);
        } else if (angle == 270) {
            rotateMatrix = rotateRight270(mat);
        } else {
            System.out.println("Неверный угол");
        }

        return rotateMatrix;
    }

    public static int[][] rotateRight180(int[][] mat) {
        int[][] rotateMatrix = rotateRight90(rotateRight90(mat));
        return rotateMatrix;
    }

    public static int[][] rotateRight270(int[][] mat) {
        int[][] rotateMatrix = rotateRight90(rotateRight90(rotateRight90(mat)));
        return rotateMatrix;
    }

    private static int[][] rotateRight360(int[][] mat) {
        int[][] rotateMatrix = rotateRight90(rotateRight90(rotateRight90(rotateRight90(mat))));
        return rotateMatrix;
    }
}
