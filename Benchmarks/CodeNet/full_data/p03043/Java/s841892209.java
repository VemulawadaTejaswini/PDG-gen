import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i >= k) {
                sum += 1;
                continue;
            }
            int cnt = 1;
            while (k > i * Math.pow(2, cnt)) {
                cnt++;
            }
            sum += Math.pow(0.5, cnt);
        }
        sum /= n;
        System.out.println(sum);
    }
}