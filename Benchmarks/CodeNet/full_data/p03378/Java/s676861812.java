import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, M, X;
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextInt();

        int[] A = new int[M];
        for (int i = 0; i < M; ++i){
            A[i] = sc.nextInt();
        }

        int l = 0;
        int r = 0;
        for (int i = 0; i < M; ++i){
            if (A[i] < X){
                ++l;
            }else if (A[i] > X){
                ++r;
            }
        }
        System.out.println(Math.min(l, r));
    }
}