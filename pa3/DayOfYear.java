/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa3;
import java.util.Scanner;
/**
 * 9/23
 * @author hliu1
 */
public class DayOfYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] monthsNames = {"JANUARY", "FEBRUARY", "MARCH",
                "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER"};
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31,
                30, 31, 30, 31};
        int a=0 , i , dayCount=0;
        String month;
        boolean valid = true;
        System.out.print("Enter a date: ");
        month = input.next();
        if (input.hasNextInt())
        {
            a = input.nextInt();
            
            if(a>0)
            {
                System.out.print(month + " " + a);
            }
            else
            {
                System.out.print("This is not a valid date. ");
                valid = false;
            }
        }
        else
        {
            System.out.print("This is not a valid date. ");
            valid = false;
        }
        dayCount+=a;
        for(i=0;!month.equalsIgnoreCase(monthsNames[i])&&
                !month.equalsIgnoreCase(monthsNames[i].substring(0,3))
                &&i<11;i++)
        {
           dayCount+= daysInMonths[i];
        }
        if(i==11&&!month.equalsIgnoreCase(monthsNames[i])&&
                !month.equalsIgnoreCase(monthsNames[i].substring(0,3)))
        {
            System.out.print(" is not a valid date. ");
        }
        else if(daysInMonths[i]<a)
        {
            System.out.print(" is not a valid date. ");
        }
        else if(valid)
        {
            System.out.print(" is day " + dayCount + " of the year. ");
        }
    }
}