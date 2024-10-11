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
public class ChangeProgram 
{
    public static void main(String[] args) 
    {
        double ip , c , p ,z;
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Amount cost:");
        ip = input.nextDouble();
        c = ip * 100;
        System.out.println("Amount paid:");
        ip = input.nextDouble();
        p = ip * 100;
        z = p - c;
        a = (int) z;
        System.out.println("Total change: $" + z / 100);
        System.out.println("Change breakdown:");
        System.out.println(a / 500 + " $5 bills");
        a = a % 500;
        System.out.println(a / 100 + " $1 bills ");
        a = a % 100;
        System.out.println(a / 25 + " quarters ");
        a = a % 25;
        System.out.println(a / 10 + " dimes ");
        a = a % 10;
        System.out.println(a / 5 + " nickels");
        a = a % 5;
        System.out.println(a + " pennies ");
    }
}
