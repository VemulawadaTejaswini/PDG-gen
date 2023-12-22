import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int[] d = new int[N + 1];
        d[0] = Math.abs(A[0]);
        sum += d[0];
        d[N] = Math.abs(A[N - 1]);
        sum += d[N];
        for(int i=1; i<N; i++){
            d[i] = Math.abs(A[i] - A[i - 1]);
            sum += d[i];
        }
        int ans = sum;

        ans -= d[0] + d[1];
        ans += Math.abs(A[1]);
        System.out.println(ans);
        for(int i=1; i<N-1; i++){
            ans = sum;
            ans -= d[i] + d[i + 1];
            ans += Math.abs(A[i + 1] - A[i - 1]);
            System.out.println(ans);
        }
        ans = sum;
        ans -= d[N] + d[N - 1];
        ans += Math.abs(A[N - 2]);
        System.out.println(ans);
    }
}