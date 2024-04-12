package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Lines: ");
        int m = sc.nextInt();
        System.out.print("Columns: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        System.out.println();

        System.out.print("Position: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (x == mat[i][j]) {
                    System.out.println(i + "," + j);
                    if (j > 0) System.out.println("Left: " + mat[i][j - 1]);
                    if (i > 0) System.out.println("Top: " + mat[i - 1][j]);
                    if (j < mat[i].length - 1) System.out.println("Right: " + mat[i][j + 1]);
                    if (i < mat.length - 1) System.out.println("Bottom: " + mat[i + 1][j]);
                }
            }
        }
        sc.close();
    }
}