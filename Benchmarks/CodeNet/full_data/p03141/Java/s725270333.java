import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
          
        int n = scan.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        long A_plus_B[] = new long[n];
        
        boolean isAturn = true;
        
        long A_sum = 0;
        long B_sum = 0;
        long cnt = 0;
        
        for(int i = 0 ; i < n ; i++){
          A[i] = scan.nextInt();
          B[i] = scan.nextInt();
          B_sum += (long)B[i];
          
          A_plus_B[i] = (long)A[i] + (long)B[i];
        }
        
        Arrays.sort(A_plus_B);
        
        for(int i = n-1 ; i >= 0 ; i-=2){
          A_sum += A_plus_B[i];
        }
        cnt = A_sum - B_sum;
            
        System.out.println(cnt);
	  }
}