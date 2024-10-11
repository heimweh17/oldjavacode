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
public class Triangle 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double a , b , c ,aandb , max ,maxsq, pri , harea, area ;
        boolean i = true , j = true;
        System.out.printf("Enter three sides of the triangle: \n");
        System.out.printf("First side length: \n");
        a = input.nextDouble();
        System.out.printf("Second side length: \n");
        b = input.nextDouble();
        System.out.printf("Third side length:  \n");
        c = input.nextDouble();
        System.out.printf("The sides entered are %.2f, %.2f "
                    + "and %.2f \n",a , b , c);
        if (a < 0 || b < 0 || c < 0)
        {
            System.out.printf("This is not a triangle. \n");
            i = false;
        }
        if (c >= a + b || b >= a + c || a >= b + c)
        {
            if(i)
            {
                System.out.printf("This is not a triangle. \n");
                i = false;
            }
        }       
        if (i)
        {
            aandb = Math.max(a, b);
            max = Math.max(aandb, c);
            maxsq = max*max;
            if ( max==a )
            {
               if(Math.abs( maxsq - b * b - c * c) <0.0001) 
               {
                   System.out.printf("This is an right triangle.\n");
               }
               else if ( maxsq > b * b + c * c)
               {
                   System.out.printf("This is an obtuse triangle.\n");
               }
               else
               {
                   System.out.printf("This is an acute triangle.\n");
               }
               j = false;
            }
            if ( max==b && j )
            {
               if( Math.abs( maxsq - a * a - c * c) <0.0001) 
               {
                   System.out.printf("This is an right triangle.\n");
               }
               else if ( maxsq > a * a + c * c)
               {
                   System.out.printf("This is an obtuse triangle.\n");
               }
               else
               {
                   System.out.printf("This is an acute triangle.\n");
               }
            }
            if ( max==c && j)
            {
               if( Math.abs( maxsq - b * b - a * a) <0.0001) 
               {
                   System.out.printf("This is an right triangle.\n");
               }
               else if ( maxsq > b * b + a * a)
               {
                   System.out.printf("This is an obtuse triangle.\n");
               }
               else
               {
                   System.out.printf("This is an acute triangle.\n");
               }
            }
            pri = a + b + c;
            System.out.printf("The perimeter is %.2f. \n" , pri);
            harea = pri/2;
            area = harea * (harea - a) * (harea - b) * (harea - c);
            area = Math.sqrt(area);
            System.out.printf("The area is %.2f.\n", area);
        }
    }
}