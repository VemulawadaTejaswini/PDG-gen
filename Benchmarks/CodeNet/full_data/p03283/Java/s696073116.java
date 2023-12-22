import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] L = new int[M + 1];
        int[] R = new int[M + 1];
        for(int i = 1; i <= M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        int[] p = new int[Q + 1];
        int[] q = new int[Q + 1];
        for(int i = 1; i <= Q; i++){
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }

        for(int i = 1; i <= Q; i++){
            int count = 0;
            for(int k = 1; k <= M; k++){
                if(p[i] <= L[k] && R[k] <= q[i])
                    count++;
            }
            System.out.println(count);
        }

    }
}