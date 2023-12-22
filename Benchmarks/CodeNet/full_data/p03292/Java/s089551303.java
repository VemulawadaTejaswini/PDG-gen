import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Main 
 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int a[]=new int[3];
        for(int i=0;i<3;i++)
        {
           a[i]=sc.nextInt();
        }
        
        Arrays.sort(a);
        int sum=0;
        for(int i=1;i<=2;i++)
        {
            int diff=a[i]-a[i-1];
            sum=sum+diff;
        }
        System.out.println(sum);
    }
}