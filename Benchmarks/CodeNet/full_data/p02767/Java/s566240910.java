import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int sumX = 0;
        for(int i=0; i<n; i++) {
            x[i] = in.nextInt();
            sumX += x[i];
        }
        // abs(X-P) の総和が最小のとき、 (X-P)^2 の総和が最小である、はず（未証明）
        int p = (int)Math.round((double)sumX / (double)n);
        long sum = 0;
        for(int i=0; i<n; i++) {
            sum += (x[i] - p) * (x[i] - p);
        }
        System.out.println(sum);
    }
}
