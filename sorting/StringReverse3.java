/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author haozhou
 */
public class StringReverse3 
{
    public static void main(String[] args) 
    {
        int i , j = 0 ,l;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String s=input.nextLine();
        String b=StringReverse3.stringReverse(s);
        System.out.println(b);
        //System.out.println(s.substring(s.length()-1,s.length()));
    }
    
    /**
     * general method for reverse the string inculde 2 different parts
     * @param s is the string which we are trying to reverse
     * @return 2 kind of, if with a blank, return word by word in reverse
     * if no blank, return each letter word by word in reverse
     */
    public static String stringReverse(String s)
    {
        if(s.indexOf(" ")>-1)
        {
            return StringReverse3.phraseReverse(s);
        }
        else
        {
            return StringReverse3.wordReverse(s);
        }
    }
    /**
     * first part of reverse program
     * @param s is the string which we are trying to reverse
     * @return letter by letter reverse
     */
    private static String wordReverse(String s)
    {
        int a=s.length();
        if(a>0)
        {
            return s.substring(a-1,a)+StringReverse3.wordReverse(s.substring(0,a-1));
        }
        return "";
        
    }
    
    /*
    private static String phraseReverse(String s)
    {
        int a=s.length();
        int b=a-1;
        if(a>0)
        {
            if(s.substring(b, a).indexOf(" ")==-1)
            {
                return StringReverse3.phraseReverse(s.substring(0, a-1));
            }
            else
            {
                return s.substring(b, a).indexOf(" ")
            }
        }
    }
    */
            
    /**
     * second part of reverse program
     * @param s is the string which we are trying to reverse
     * @return word by word reverse
     */
    private static String phraseReverse(String s)
    {
        if(s.indexOf(" ")!=-1)
        {
            return StringReverse3.phraseReverse(s.substring(s.indexOf(" ")+
                    1,s.length()))+" "+
                    s.substring(0,s.indexOf(" "));
        }
        else
        {
            return s;
        }
        //return "";
    }
}
