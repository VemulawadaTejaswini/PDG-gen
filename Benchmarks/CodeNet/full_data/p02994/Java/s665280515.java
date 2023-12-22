import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int base = Integer.parseInt(sc.next());
        int[] taste = new int[n];
        int maxTaste = 0;
        for (int i = 0; i < n; i++) {
            taste[i] = 1 + (base + i - 1);
            maxTaste += taste[i];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                sum += taste[j];
            }
            if (min > Math.abs(maxTaste - sum)) {
                min = Math.abs(maxTaste - sum);
            }
        }
        System.out.println(maxTaste - min);
    }
}