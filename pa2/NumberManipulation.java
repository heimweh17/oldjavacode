/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa2;
import java.util.Scanner;
/**
 * 9/9
 * @author haozhou
 */
public class NumberManipulation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n , k , sum;
        sum = 0;
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();
        System.out.print("Enter a positive integer that is " +
                "at least 2: ");
        k = input.nextInt();
        while (n!=1)
        {
            sum = sum + n;
            if (n%k==0)
            {
                n = n/k;
            }
            else
            {
                n++;
            }
        }
        System.out.printf("The resulting sum is %d\n",sum);   
    }
}
