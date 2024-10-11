package pa2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author hliu1
 */
public class Rounding
{
    public static void main(String[] args)
    {
        double n;
        double dg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = input.nextDouble();
        System.out.println("How many places to round? ");
        dg = input.nextInt();
        dg = Math.pow(10, dg);
        n = (int) (n * dg + 0.5) / dg ;
        System.out.println("The rounded number is " + n);
    }
}
