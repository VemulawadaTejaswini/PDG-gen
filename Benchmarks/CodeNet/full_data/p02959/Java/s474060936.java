import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[]args){
       long  ans= 0;
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       long A[] = new long[N + 1];
       long B[] = new long[N];
       for(int i = 0;i <= N;i++){
        A[i] = sc.nextLong();
       }
       for(int i = 0;i < N;i++){
           B[i] = sc.nextLong();
       }
       sc.close();
       for(int k = 0;k < N;k++){
           if(A[k] + A[k + 1] >= B[k]){ans += B[k];}
           else{ans += (A[k] + A[k + 1]);}
       }
       System.out.println(ans);
    }  
}