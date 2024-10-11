/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author haozhou
 */
public class Test1 
{
    public static void main(String[] args) 
    {
        //Testing swap
        System.out.println("Testing swap:");
        int[] arr = {1, 2, 2, 4, 7,9,11,15,24,49};
        //System.out.println(ArrayUtility.swap(arr, 2, 4));
        System.out.println("now its show time");
        System.out.println(ArrayUtility.linearSearch(arr, 161));
        System.out.println(ArrayUtility.binarySearch(arr,61));
        ArrayUtility.shuffle(arr);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+",");
    }
}
