import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int a [] = new int[n];
        Arrays.fill(a, k);
        int b [] = new int[q];
        for(int i = 0 ; i<q ; i++){
            
            b[i] =sc.nextInt();
            
            for( int j = 0 ; j< n; j++){
              if(j!=b[i]-1)  a[j] = a[j]-1;
      
            }
        }
        for(int i = 0 ; i<n ; i++){
            
            if(a[i]<=0)System.out.println("No");
           else System.out.println("Yes");
            
        }
        
        
        
        
        
        
        
    }
 
}
