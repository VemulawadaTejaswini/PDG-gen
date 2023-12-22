import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();

        long[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        long ans = 1000000000;

        for(int i = 0; i < N; i++){
//            System.out.println("A[" + i + "]:" + A[i]);
        }
        for(int i = 0; i < N - K - Q + 2; i++){
 //           System.out.println("A[" + (i + Q - 1) + "]-A[" + i + "]:" + (A[i + Q - 1] - A[i]));
            ans = Math.min(ans, A[i + Q - 1] - A[i]);
        }
        System.out.println(ans);
    }
}