/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package May.Codechef;

/**
 *
 * @author poojan
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int n=input.nextInt();
        
        ArrayList <Integer>ind=new <Integer>ArrayList();
        
        int q=input.nextInt();
        
        System.out.flush();
        
        String str=input.next();
        
        
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)=='A'&& str.charAt(i+1)=='C')
            {
                ind.add(i);
            
            }
        
        
        
        }
        
        
        for(int i=0;i<q;i++)
        {
            int count=0;
            int l=input.nextInt();
            int r=input.nextInt();
            for(int j=0;j<ind.size();j++)
            {
                if(((ind.get(j)>=l-1)&&(ind.get(j)<=r-1))&&((ind.get(j)+1>=l-1)&&(ind.get(j)+1<=r-1)))
                    count++;
            }
            System.out.println(count);
        
        }
        
        
        
    }
    
}
