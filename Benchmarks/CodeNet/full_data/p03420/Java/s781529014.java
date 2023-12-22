import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0;
        if(K==0) {
            System.out.println(N*N);
            return;
        }
        for(int i = K+1; i<=N; i++) {
            System.err.println((N)/i * (i-K) +" , "+ Math.max(N%i-(K-1), 0));
            ans += (N)/i * (i-K) + Math.max(N%i-(K-1), 0);
        }
        System.out.println(ans);
    }
}