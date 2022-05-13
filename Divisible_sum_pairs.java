/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible_sum_pairs;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Divisible_sum_pairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         *3.	Write a function that given an array of integers and a positive 
         * integer k, it returns the number of (i,j) pairs where i < j and ar[i]
         * + ar[j] is divisible by k.   
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number would you like to check divisibility by the pairs?");
        int n = scanner.nextInt();
        System.out.println("Enter the values");
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = scanner.nextInt();
        }
 
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i != j && (a[i] + a[j]) % k == 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    
}
