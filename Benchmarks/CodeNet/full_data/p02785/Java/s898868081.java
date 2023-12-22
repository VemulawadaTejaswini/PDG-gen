import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list);

        long sum = 0;

        for (int i = n - 1 - k; i >= 0; i--) {
            sum += list[i];
        }

        System.out.println(sum);
    }
}