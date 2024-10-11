/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author hliu1
 */
public class RecursionPractice
{
   /**
     * calculates the nth term in the Fibonacci sequence.  
     * @param n is the number we a trying to found
     * @return is the number on that position
     */
    public static int fib(int n)
    {
        int curr = 1;
        int prev = 1;
        for(int i = 3; i <= n; ++i)
        {
            int next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
   
   /**
     * calculates  the  greatest  common  divisor  of  two positive integers
     * @param num1 is the first number
     * @param num2 is the second number
     * @return int, the great common divisor
     */
    public static int gcd(int num1, int num2)
    {
        int small = Math.min(num1, num2);
        int large = Math.max(num1, num2);
        if(small==0&&large==0)
        {
            return 1;
        }
        if(small==0)
        {
            return large;
        }
        int a = large % small;
        while (2>1)
        {
            a = large % small;
            if(a==0)
            {
                return small;
            }
            else
            {
                large=small;
                small=a;
            }
        }
       
       
    }
   
   /**
     * recursively  performs  binary  search
     * @param arr is the array that we a trying to search
     * @param value is the value we found
     * @return int, use another method.
     */
    public static int binarySearch(int[] arr, int value)
    {
        return binarySearch(arr,value,0,arr.length-1);
    }
    
    /**
     * recursively  performs  binary  search
     * @param a is the array we trying to search
     * @param n is the value we found
     * @param s is the small index of array
     * @param e is the bif index of the array
     * @return int shows the index of the value,.if can't found return -1.
     */
    private static int binarySearch(int[] a, int n, int s, int e)
    {
        if(n==a[(a.length-1)])
        {
            return (a.length-1);
        }
        else if(n==a[0])
        {
            return 0;
        }
        else if(s+1==e)
        {
            return -1;
        }else if(a[(s+e)/2]<n)
        {
            //System.out.print("1");
            return binarySearch(a,n,(s+e)/2,e);
        }
        else if(a[(s+e)/2]>n)
        {
            //System.out.print("2");
            return binarySearch(a,n,s,(s+e)/2);
        }
        else if(a[(s+e)/2]==n)
        {
            return (s+e)/2;
        }
        return -1;
    }
   //main method. test the program
    public static void main(String[] args) {
        int[] a=new int[6];
        a[0]=-2;
        a[1]=-1;
        a[2]=5;
        a[3]=7;
        a[4]=7;
        a[5]=9;
        System.out.print(RecursionPractice.gcd(3, 6));
        System.out.print(RecursionPractice.fib(5));
        System.out.print(RecursionPractice.binarySearch(a, 7));
        System.out.print(RecursionPractice.binarySearch(a, 8));
        System.out.print(RecursionPractice.binarySearch(a, -2));
        System.out.print(RecursionPractice.binarySearch(a, 9));
        System.out.print(RecursionPractice.binarySearch(a, 13));
    }
}

