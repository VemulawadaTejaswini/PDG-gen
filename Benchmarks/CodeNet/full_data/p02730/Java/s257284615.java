import java.util.Scanner;



import java.lang.*; 
import java.io.*; 
import java.util.*; 


public class Main
{
   
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.nextLine();
        
        boolean flag = false;
        StringBuilder test = new StringBuilder();
        
        test.append(s);
        

        test = test.reverse();
        String reverse = test.toString();
        if(s.equals(reverse))
            flag = true;
        
        if(flag == true)
        {
            String s1 = s.substring(0,((s.length()-1)/2));
            
            
            String s2 =s.substring((s.length()+1)/2,s.length());
            
            if(s1.equals(s2))
            {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
               
        }
        else   
            System.out.println("No");
    }
}

