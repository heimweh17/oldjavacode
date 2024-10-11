/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author haozhou
 */
public class sortertest {
    public static void main(String[] args) {
        int[] a = new int[] {3, 2, 545,1,877 ,7,-12,5,29,87,324,-14};
        sorting.Sorter.quickSort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" " ); 
        }
            
        
        
    }
}
