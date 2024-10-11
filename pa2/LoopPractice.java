/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa2;
import java.util.Scanner;
/**
 *
 * @author haozhou
 */
public class LoopPractice 
{
    public static void main(String[] args) 
    {
        int a , b ,i;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a starting number:");
        a = input.nextInt();
        System.out.printf("Enter an ending number:");
        b = input.nextInt();
        System.out.printf("Displaying using for loop:");
        for (i=a;i<=b;i++)
        {
            System.out.printf("%d%s%d\n",i,"   ",i*i);
        }
        System.out.printf("Displaying using while loop:");
        System.out.printf("Displaying using do...while loop:");
    }
    
}
