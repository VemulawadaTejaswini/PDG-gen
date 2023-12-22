import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[100000 + 1];
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            count[sc.nextInt()]++;
        }

        int[] table = new int [100000 + 1];
        for (int i = 1; i < table.length; i++) {
            table[i] = table[i - 1] + count[i];
        }

        int ans = 0;
        for (int i = 3; i < table.length; i++) {
            ans = Math.max(ans, table[i] - table[i - 3]);
        }
        System.out.println(ans);
    }
}
