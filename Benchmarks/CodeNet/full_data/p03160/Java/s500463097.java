import java.util.*;
public class MyClass {
    
    static int frog(int[] arr, int n){
        
        int result[] = new int[n];
        result[1] = Math.abs(arr[1]-arr[0]);
        result[0] = arr[0];
        for(int i=2; i<n; i++){
            result[i] = Math.min(result[i-1]+Math.abs(arr[i]-arr[i-1]),result[i-2]+Math.abs(arr[i]-arr[i-2]));
        }
        
      
        return result[n-1];
    }
    
    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
        }
        
        
        
        
      

    int result = frog(arr,n);
    System.out.println(result);
     
    }
}