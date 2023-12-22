import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // ロード
        long K = Long.parseLong(sc.next());

        // 処理
        int N;
        if (K / (int) Math.pow(10.0, 16.0) <= 2) {
            N = 2;
        } else {
            N = (int) (K / (int) Math.pow(10.0, 16.0));
        }
        long[] array = new long[N];
        // initial
        long addVal = K / N;
        for (int i = 0; i < N; i++) {
            array[i] = N - 1 + addVal;
        }
        array[0] += (K % N) * N;

        // 出力
        System.out.println(N);
        for (long ele : array) {
            System.out.print(ele + " ");
        }

        // scanner
        sc.close();
    }
}
