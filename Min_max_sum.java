/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min_max_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author maria
 */
public class Min_max_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * 1.	Write a function that given five positive integers, it will find the 
         * minimum and the maximum values that can be calculated by summing exactly 
         * four of the five integers. The function should return the respective minimum 
         * and the maximum values as a single line of two space separated long integers. 
         */
        int[] ints = {1, 3, 5, 7, 9};
        List<Integer> array = new ArrayList<Integer>();
        for (int index = 0; index < ints.length; index++)
        {
            array.add(ints[index]);
        }
        
        long maxno = 0, minno = 0;
        Collections.sort(array);
        
        for(int i = 0, j = array.size()-1; i < array.size()-1; i++, j--){
            minno += array.get(i);
            maxno += array.get(j);
        }
        
        System.out.print(minno+" "+maxno);
        
    }
    
}
