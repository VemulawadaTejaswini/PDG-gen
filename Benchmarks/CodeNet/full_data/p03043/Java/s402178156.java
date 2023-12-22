import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] counter = new int[n];
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            counter[i] = (int)(Math.log((double)k / x) / Math.log(2)) + 1;
        }
        double pre = 0.0;
        int counter_end = n;
        if (n >= k) {
            pre = (double)(n - k + 1) / n;
            counter_end = k - 1;
        }
        double post = 0.0;
        for (int i = 0; i < counter_end; i++) {
            post += Math.pow(0.5, counter[i]);
        }
        post /= n;
        System.out.println(pre + post);
        sc.close();
    }
}