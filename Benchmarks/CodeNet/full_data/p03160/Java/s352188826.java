
package javaapplication9;
import java.util.*;
import java.io.*;
public class JavaApplication9 {
 
 public static int frog(int arr[], int i, int prev){
     if(i >= arr.length)
           return 0;
     if(i == arr.length-1)
         return Math.abs(arr[prev]- arr[i]);
     int a = 0; int b = 0;
     if(prev == -1){
        return Math.min(0+frog(arr,i+1,0),0+frog(arr,i+2,0));
     }
    
     else{
            // System.out.println(arr[prev]+ " - " + arr[i] );
             a =   Math.abs(arr[prev] - arr[i]) + frog(arr,i+1,i);
             b =   Math.abs(arr[prev] - arr[i]) + frog(arr,i+2,i);
     
     }
  
 return Math.min(a,b);
  
 }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer str  = new StringTokenizer(br.readLine()," ");
        int i = 0;
        while(str.hasMoreTokens()){
            arr[i] = Integer.parseInt(str.nextToken());
            i++;
        }
        
           int[] dp = new int[arr.length];
           Arrays.fill(dp,-1);
            System.out.println(frog(arr,0,-1));
        
        
    }
    
}
