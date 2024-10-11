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
public class Sorter {
    private static int comparisons;
    private static int assignments;
    /**
     * make 2 data filed zero
     * make then count from 0
     */
    public static void resetCounts(){
        comparisons=0;
        assignments=0;
    }
    /**
     * show user how this works, and how it print
     */
    public static void printCounts(){
        System.out.println("The number of comparisons: " + comparisons +
        "The number of assignments: " + assignments);
    }
   /**
     * sorting the integer array in selection Sort way
     * @param a array is an array that are integer
     * make the array in aceding order
     */
    public static void selectionSort(int[] a)
    {
        int min,minindex=0,i,n=a.length,j;
        for(i=0;i<n-1;i++)
        {
            min=999999;
            for(j=i;j<n;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    minindex=j;
                }
                comparisons++;
            }
            sorting.ArrayUtility.swap(a, i, minindex);
            assignments++;
            assignments++;
        }
    }
   
    /**
     * sorting the integer array in insertion Sort way
     * @param a array is an array that are integer
     * make the array in acceding order
     */
    public static void insertionSort(int[] a)
    {
        int i,n=a.length,j,k;
        boolean settle;
        for(i=1;i<n;i++)
        {
            k=a[i];
            settle=true;
            for(j=i-1;j>=0&&settle;j--)
            {
                if(k<a[j]&&j==0)
                {
                    a[j+1]=a[j];
                    a[j]=k;
                    settle=false;
                }
                else if(k<a[j]&&j!=0)
                {
                    a[j+1]=a[j];
                    comparisons++;
                    assignments++;
                }
                else
                {
                    a[j+1]=k;
                    settle=false;
                    comparisons++;
                    assignments++;
                }
               
            }
            comparisons++;
            assignments++;
        }
       
    }
    /**
     * spilt the integer array in two 2 same size
     * @param a array is an array that are integer
     * @param h1 first half of array
     * @param h2 second half of array
     */
    private static void split(int[] a,int[] h1,int[] h2)
    {
        int i,n=a.length,j;
        for(i=0;i<n/2;i++)
        {
            h1[i]=a[i];
            assignments++;
        }
        for(j=i;j<n;j++)
        {
            h2[j-i]=a[j];
            assignments++;
        }
    }
    /**
     * merge 2 arrays in order
     * @param a array is going to merge
     * @param h1 first half of array
     * @param h2 second half of array
     * make it in acceding order
     */
    private static void merge(int[] a,int[] h1,int[] h2)
    {
        int i,a1=0,a2=0;
        int n=h1.length+h2.length;
        boolean alert=true;
        for(i=0;i<n&&alert;i++)
        {
            if(h1[a1]<h2[a2])
            {
                a[i]=h1[a1];
                a1++;        
            }
            else
            {
                a[i]=h2[a2];
                a2++;
            }
            comparisons++;
            assignments++;
            if(a1==h1.length||a2==h2.length)
            {
                alert=false;
            }
            
        }
       
        for(;a1<h1.length;i++,a1++)
        {
            a[i]=h1[a1];
            assignments++;
        }

        for(;a2<h2.length;i++,a2++)
        {
            a[i]=h2[a2];
            assignments++;
        }

       
    }
    /**
     * make an array in acceding order in merge sort way
     * @param a array is going to sort
     */
    public static void mergeSort(int[] arr)
    {
        int[] h1;
        h1=new int[arr.length/2];
        int[] h2=null;
        h2=new int[arr.length-arr.length/2];
        sorting.Sorter.split(arr,h1,h2);
        if(h1.length!=1)
        {
            sorting.Sorter.mergeSort(h1);
        }
        if(h2.length!=1)
        {
            sorting.Sorter.mergeSort(h2);
        }
        sorting.Sorter.merge(arr, h1, h2);
        
           /*for(int i=0;i<h1.length;i++)
           {
               System.out.println(h1[i]);
           }
           for(int i=0;i<h2.length;i++)
           {
               System.out.println(h2[i]);
           }*/
           
    }
    
    /**
     * make an array in acceding order in quick way
     * @param a array is going to sort
     */
    public static void quickSort(int[] arr)
    {
        sorting.Sorter.quickSort(arr,0,arr.length-1);
    }
    /**
     * make an array in acceding order in quick way
     * @param a array is going to sort
     * @param start is the starting point of this sort
     * @param end is the ending point of the sort
     */
    private static void quickSort(int[] a, int start, int end)
    {
        if(start<end)
        {
            int p=a[start];
            assignments++;
            int i,j;
            for(i=start,j=end;i<j;)
            {
                while(a[j]>p&&i<j)
                {
                    j--;
                    comparisons++;
                }
            
            
                while(a[i]<p&&i<j)
                {
                    i++;
                    comparisons++;
                }
                if(i<j)
                {
                    sorting.ArrayUtility.swap(a, i, j);
                    assignments++;
                    assignments++;
                }
            
            
            }
            a[i]=p;
            assignments++;
            sorting.Sorter.quickSort(a, start,i-1);
            sorting.Sorter.quickSort(a, i+1,end);
        }
        
        
        
    }
    
    /**
     * make an array in acceding order in counting sort way
     * @param a array is going to sort
     * return nothing, its just sort the array
     * it can work for both positive and negative
     * efficency is O(n+r)
     */
    public static void countingSort(int[] a)
    {
        int max=a[0];
        int min=max;
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max) 
            {
                max=a[i];
                comparisons++;
            }
            if(a[i]<min)
            {
                min=a[i];
                comparisons++;
            }
        }
        int[] f=new int[max-min+1];
        for(int i=0;i<a.length;i++)
        {
            f[a[i]-min]++;
        }
        for(int i=0;i<f.length;i++)
        {
            for(int j=0;j<f[i];j++)
            {
                a[k]=i+min;
                k++;
                assignments++;
            }
        }
    }
}
/*
for(int i=0;i<a.length;i++)
        {
            min=a[i];
            minindex=i;
            for(int j=i;j<a.length;j++)
            {
                comparisons++;
                if(a[j]<a[i])
                {
                    min=a[j];
                    minindex=j;
                    //System.out.println(j+"hha"+i);
                }
               
            }
            ArrayUtility.swap(a, i, minindex);
            assignments=assignments+2;
        }
        //System.out.println(comparisons+"hha"+assignments);
*/

/*for(i=0;i<n;i++)
        {
            k=a[i];
            settle=false;
            //System.out.println("xx"+k);
            for(j=i;j>0&&settle==false;j--)
            {  
                //System.out.println("xx"+k);
                //a[j]=a[j-1];
               
                if(k>a[j])
                {
                    settle=true;
                    a[j]=k;
                    S//ystem.out.println("doone"+k);
                }
                else
                {
                    a[j]=a[j-1];
                }
            }
            //a[j]=k;
        }
    */