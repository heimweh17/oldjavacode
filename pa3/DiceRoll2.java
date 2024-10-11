/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa3;
import java.util.Scanner;
/**
 *
 * @author hliu1
 */
public class DiceRoll2 
{
    public static void main(String[] args) 
    {
        int i = 0 ;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s","Enter number of rolls: ");
        double s=input.nextInt();
        System.out.printf("%s","Number of dice: ");
        double k=input.nextInt();
        System.out.printf("%s","Number of sides:");
        double t=input.nextInt();
        int a[] = new int[(int)(t*k)+(int)k];
        int variableName;
        final int MAX_STARS = 40;
        double max=0,maxnum=0;
        double percentage=0;
        System.out.printf("%s\n","Histogram");
        for (i=0;i<s;i++)
        {   
            variableName=0;
            for(int j=0;j<k;j++)
            {
                    
                variableName=(int)(Math.random()*t+1)+variableName;
            }
            ++a[variableName];
        }
        
        //System.out.printf("%5s%15s%25s\n","#","Count","Freq");
        for (i=(int)k;i<t*k+1;i++)
        {
            /*
            percentage=a[i]*MAX_STARS/s;
            
            percentage=percentage+0.5;
            System.out.printf("%2d%s",i,"|");
            for(int j=0;j<(int)(percentage);j++)
            {
                System.out.printf("%s","*");
            }
            System.out.printf("\n");
                */
            if(a[i]>max)
            {
                max=a[i];
                maxnum=i;
            }
        }
        //System.out.print(max);
        for (i=(int)k;i<t*k+1;i++)
        {
            percentage=(((a[i]/max)*MAX_STARS)+0.5);
            System.out.printf("%2d%s",i,"|");
            for(int j=0;j<(int)(percentage);j++)
            {
                
                System.out.printf("%s","*");
            }
           // System.out.print(percentage);
            System.out.printf("\n");
        }
        //System.out.printf("%5s%15.0f%26s\n","Total",s,"100.00%");
    }
}
