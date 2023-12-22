import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];

        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
        }
        int ans = (int) 2e9;

        for(int i=0;i<=N-K;i++){
            ans = Math.min(ans, dist(x[i], x[i+K-1]));
        }

        System.out.println(ans);
    }

    public static int dist(int A, int B){
        return Math.min(Math.abs(A)+Math.abs(A-B), Math.abs(B) + Math.abs(A-B));
    }
}