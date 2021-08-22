package EXERCISE;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        char startChar = 'a';
        String[][] matrixPal = new String[rows][columns];
        if(rows + columns <= 27){ ;
            palindromeMatrix(matrixPal,rows,columns);
            printMatrix(matrixPal, rows, columns);

        }
    }
    public static void palindromeMatrix(String[][] matrix, int rows, int columns)
    {
        Scanner sc = new Scanner(System.in);
        char first = 'a';
        for (int row = 0; row < rows; row++) {
            char currentLetter = first;
            for (int column = 0; column < columns; column++) {
                StringBuilder currentPalindrome = new StringBuilder();
                currentPalindrome.append(first);
                currentPalindrome.append(currentLetter);
                currentPalindrome.append(first);
                matrix[row][column] = currentPalindrome.toString();
                currentLetter++;
            }
            first++;
        }
    }
    public static void printMatrix(String[][] matrix, int rows, int columns)
    {
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
