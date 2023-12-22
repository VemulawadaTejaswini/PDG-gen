import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int count = 0;

        for (int b = 1; b <= N; b++) {
            // Nをbで割った商
            int q = N / b;
            // Nをbで割ったあまり
            int r = N % b;

            // 余り0 から b - 1がq回繰り返される(0を含む)
            // そのうちK以上の数
            count += Math.max(0, b - K) * q;
            // 最後の1からrまでの流れ
            count += Math.max(0,r - K + 1);
        }
        if(K == 0) {
            count -= K;
        }
        System.out.println(count - 10);
    }
}
