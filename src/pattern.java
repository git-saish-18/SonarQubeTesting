import java.util.Scanner;

public class ZigzagPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Create a 2D array to store the zigzag pattern
        char[][] zigzag = new char[rows][columns];

        // Fill the array with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                zigzag[i][j] = ' ';
            }
        }

        // Fill the array to form the zigzag pattern
        int row = 0;
        boolean goingDown = true;
        for (int col = 0; col < columns; col++) {
            zigzag[row][col] = '*';

            if (goingDown) {
                if (row + 1 < rows) {
                    row++;
                } else {
                    row--;
                    goingDown = false;
                }
            } else {
                if (row - 1 >= 0) {
                    row--;
                } else {
                    row++;
                    goingDown = true;
                }
            }
        }

        // Print the zigzag pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(zigzag[i][j]);
            }
            System.out.println();
        }
    }
}
