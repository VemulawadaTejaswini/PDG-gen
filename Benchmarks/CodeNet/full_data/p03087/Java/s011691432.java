
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        int n=input.nextInt();
        int q=input.nextInt();
        System.out.flush();
        String s=input.next();
       
        int a[]=new int[q];
        int b[]=new int[q];
        char[] ch = new char[s.length()]; 
        
        for (int i = 0; i < s.length(); i++) { 
            ch[i] = s.charAt(i); 
        } 
  
          
        for(int i=0;i<q;i++)
        {
            a[i]=input.nextInt();
            b[i]=input.nextInt();
            for(int j=a[i];j<=b[i]-1;j++)
            {
                if(ch[j-1]=='A' && ch[j]=='C')
                {
                    count++;
                }
            }
             System.out.println(count);
             count=0;
            
        }
         
  
      
        
     
    }
}
