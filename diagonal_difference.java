package diagonal_difference;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author maria
 */
public class diagonal_difference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * 2.	Write a function that given a square matrix, it will return the 
         * absolute difference between the sum of its diagonals.   
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for the square matrix");
        int n = in.nextInt();
        System.out.println("Enter the matrix values");
        int array[][] = new int[n][n];
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
                if (i == j) {
                    d1 = d1 + array[i][j];
                }
                if (i + j == n - 1) {
                    d2 = d2 + array[i][j];
                }
            }
        }
        System.out.println(Math.abs(d1 - d2));
    }
    
}
