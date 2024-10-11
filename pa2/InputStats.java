/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa2;
import java.util.Scanner;
/**
 *
 * @author hliu1
 */
public class InputStats 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double average = 0,max = 0,min = 0,a;
        int maxc = 1,minc = 1;
        int i = 0,j = 0;
        boolean stop = true , first = false;
        String x;
        while(stop)
        {
            System.out.print("Enter a number (type \"stop\" to stop):");
            if (input.hasNextDouble())
            {
                a = input.nextDouble();
                average = average + a;
                if(!first)
                {
                    max=a;
                    min=a;
                    first=true;
                }
                if(max<a)
                {
                    max=a;
                    maxc=i+1;
                }
                if(a<min)
                {
                    min=a;
                    minc=i+1;
                }
                i++;
            }
            else 
            {
                x = input.next();
                if(x.equals("stop"))
                {
                    stop=false;
                }
                else
                {
                    System.out.println("not a number....");
                    j++;
                }
            }   
        }
        System.out.println(i + " numbers were entered "
                + "with " + j + " invalid inputs.");
        System.out.println("The average of the "
                + "numbers entered is " + average/i);
        System.out.println("The maximum was " + max 
                + ".It was the " + maxc + " number");
        System.out.println("The minium was " + min
                + ".It was the " + minc + " number");
    }
}
