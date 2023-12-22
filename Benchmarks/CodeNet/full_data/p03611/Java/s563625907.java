import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[100000 + 1];
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            count[sc.nextInt()]++;
        }

        int[] table = new int [100000 + 2];
        for (int i = 0; i <= 100000; i++) {
            table[i + 1] = table[i] + count[i];
        }

        int ans = 0;
        for (int i = 3; i < table.length; i++) {
            ans = Math.max(ans, table[i] - table[i - 3]);
        }
        System.out.println(ans);
    }
}
