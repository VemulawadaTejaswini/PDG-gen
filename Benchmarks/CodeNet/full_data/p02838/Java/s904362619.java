import java.util.*;
 import java.io.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    public static void main(String args[] ) throws Exception {
     
        Scanner s = new Scanner(System.in);
 
	int n=s.nextInt();
      long a[]=new long[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextLong();
      System.out.println(sumXOR(a,n));
    }
static long sumXOR(long arr[], int n) 
    { 
        long sum = 0; 
        for (int i = 0; i <64; i++)  
        { 
            // Count of zeros and ones 
            int zc = 0, oc = 0;  
              
            // Individual sum at each bit position 
            long idsum = 0;  
              
            for (int j = 0; j < n; j++) 
            { 
                if (arr[j] % 2 == 0) 
                    zc++; 
                      
                else
                    oc++; 
                arr[j] /= 2; 
            } 
              
            // calculating individual bit sum  
            idsum = ((oc%1000000007) * (zc%1000000007) * (1 << i)%1000000007)%1000000007;  
      
            // final sum  
            sum =(sum%1000000007+idsum%1000000007)%1000000007;  
        } 
        return sum; 
    } 
}