import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += p[j];
            }
            if (max < sum) {
                max = sum;
                maxIndex = i;
            }
        }

        double result = 0;
        for (int i = maxIndex; i < maxIndex + k; i++) {
            result += (double) sum(p[i]) / (double) p[i];
        }

        // 出力
        System.out.println(result);
        sc.close();
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = n; 0 < i; i--) {
            sum += i;
        }
        return sum;
    }
}