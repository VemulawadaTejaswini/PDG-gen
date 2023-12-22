import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    int A[]=new int[n];
    
    for(int i=0;i<n-1;i++)
        A[i]=s.nextInt();
     Arrays.sort(A);
     
     
      int count = 0; 
  
    for (int i = n - 1; i >= 1; i--) 
    { 
        int l = 0, r = i - 1; 
        while (l < r) 
        { 
            if (A[l] + A[r] > A[i]) 
            { 
  
                // If it is possible with a[l], a[r] 
                // and a[i] then it is also possible 
                // with a[l+1]..a[r-1],a[r] and a[i] 
                count += r - l; 
  
                //checking for more possible solutions 
                r--; 
            }  
            else // if not possible check for  
                 // higher values of arr[l] 
            { 
                l++; 
            } 
        } 
    } 
   
    System.out.println(count);
  }
}