import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int K[] = new int[N-1];
        for(int i=0; i<N-1; i++) {
            K[i] = 0;
        }
        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                // 最短距離
                int d = Math.min(Math.abs(i-j),
                        Math.min(Math.abs(X-1-i) + 1 + Math.abs(Y-1-j),
                                 Math.abs(Y-1-i) + 1 + Math.abs(X-1-j)));
                K[d-1] += 1;
            }
        }
        for (int k: K) {
            System.out.println(k);
        }
    }
}