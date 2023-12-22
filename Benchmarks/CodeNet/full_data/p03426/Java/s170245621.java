

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class Main{

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int px[]=new int[90001];
        int py[]=new int[90001];
        int diff[]=new int[90001];
        int h=sc.nextInt();
        int w=sc.nextInt();
        int d=sc.nextInt();
        for (int i = 0; i < h; i++)  
    {  
        for (int j = 0; j < w; j++)  
        {  
           int A=sc.nextInt();
           px[A] = i;
           py[A] = j;  
        }  
    }  
    for (int i = d + 1; i <= h * w; i++)  
        diff[i] = diff[i - d] + Math.abs(px[i] - px[i - d]) + Math.abs(py[i] - py[i - d]);  
    int q=sc.nextInt();
    while (q-->0)  
    {  
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(diff[r]-diff[l]);  
    }  

      
    }

    
}
