import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        sc.close();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= N-K; i++){
            min = Math.min(min, Math.abs(x[i+K-1] - x[i])+Math.min(x[i+K-1], x[i]));
        }
        System.out.println(min);
    }
}