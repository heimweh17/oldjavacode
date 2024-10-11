/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

//import java.util.ArrayList;

/**
 *
 * @author haozhou
 */
public class ArrayUtility 
{
    /**
     * swap the number in the a array  index ib and ic
     * @param a is the array that going to fix. its a int array
     * @param ib is the first index of the number. its a int
     * @param ic is the second index of the number. its a int
     * @return boolean that see if its success
     */
    public static boolean swap(int[] a, int ib, int ic)
    {
        int d=a.length;
        if(d>=ic&&d>=ib&&ic>=0&&ib>=0)
        {
            int b=a[ib];
            int c=a[ic];
            a[ib]=c;
            a[ic]=b;
            return true;
        }
        return false;   
    }
    /**
     * print the array a
     * @param a is array that going to be print
     */
    public static void print(int[] a)
    {
        int d=a.length;
        System.out.print("[");
        for(int i=0;i<d;i++)
        {
            if(i==d-1)
            {
                System.out.print(a[i]);
            }
            else
            {
                System.out.print(a[i]+",");
            }
            
        }
        System.out.print("]");
    }
    /**
     * test if the array is Ascending
     * @param a is array that going to be test
     * @return boolean to tell if it is true
     */
    public static boolean isAscending(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            }
        }
        return true;
    }
    /**
     * make an array with random digits
     * @param n is the int that the size of the array
     * @return a array with each of its digit 0-999
     */
    public static int[] randomArray(int n)
    {
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=(int)(Math.random()*1000);
        }
        return a;
    }
    /**
     * make an array with random digits and Ascending
     * @param n is the int that the size of the array
     * @return a array with The  first  element  should  be  a  random 
     *  integer  between  0  and  9.    Each  of  the  other  elements  should  
     * be  larger  than  the 
     *  previous  one  by  a  random  step  size  between  0  and  4.  
     */
    
    public static int[] randomSortedArray(int n)
    {
        int[] a=new int[n];
        a[0]=(int)(Math.random()*10);
        for(int i=1;i<n;i++)
        {
            a[i]=a[i-1]+(int)(Math.random()*5);
        }
        return a;
    }
    /**
     * search the array with linear
     * @param a is the array it self
     * @param n is the number trying to found  
     * linear search
     * @return the index of number if no return -1
     */
    public static int linearSearch(int[] a, int n)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                return i;
            }
        }
        return -1;
    }
    /**
     * search the array with binary
     * @param a is the array it self
     * @param n is the number trying to found  
     * binary search
     * @return the index of number if no return -1
     */
    public static int binarySearch(int[] a, int n)
    {
        //int k=0;
        if(n==a[(a.length-1)])
        {
            return (a.length-1);
        }
        else if(a[(a.length-1)/2]<n)
        {
            return search(a,(a.length-1)/2,(a.length-1),n);
            
        }else if(a[(a.length-1)/2]>n)
        {
            return search(a,0,(a.length-1)/2,n);
        }else if(a[(a.length-1)/2]==n)
        {
            return (a.length-1)/2;
        }else
            return -1;
    }
    /**
     * search the array with binary
     * @param a is the array it self
     * @param n is the number trying to found  
     * @param s starting index
     * @param e end index
     * binary search as a part of  binarySearch
     * @return the index of number if no return -1
     */
    private static int search(int[] a,int s, int e,int n)
    {
        if(s+1==e)
        {
            return -1;
        }else if(a[(s+e)/2]<n)
        {
            return search(a,(s+e)/2,e,n);
        }
        else if(a[(s+e)/2]>n)
        {
            return search(a,s,(s+e)/2,n);
        }
        else if(a[(s+e)/2]==n)
        {
            return (s+e)/2;
        }
        return -1;
            
    }
    /**
     * swap every part of array
     * @param a is the array it self
     * Swap the elements at the sequential index and at the random index. 
     * @return nothing
     */
    public static void shuffle(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int b=(int) (Math.random()*a.length);
            ArrayUtility.swap(a, i, b);
        }
    }
}
