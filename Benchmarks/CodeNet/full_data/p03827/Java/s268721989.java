import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max=0;
        int temp=0;
        String s = scanner.next();
        
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            temp++;
            else
            temp--;
            
            max = Math.max(temp,max);
            
            
        }
        
        System.out.println(max);
        
     }
}