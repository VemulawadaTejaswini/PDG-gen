import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] Bi = new int[M];
        for (int i=0; i<M; i++) {
            Bi[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i=0; i<N; i++) {
            int cal = 0;
            for (int j=0; j<M; j++) {
                int A = sc.nextInt();
                int B = Bi[j];
                cal = cal + (A * B);
            }
            if ((cal + C) > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
