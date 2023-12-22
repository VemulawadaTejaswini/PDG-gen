import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] monsters = new Integer[n];
        for (int i = 0; i < n; i++) {
            monsters[i] = sc.nextInt();
        }
        Arrays.sort(monsters, Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i <= k - 1) {
                monsters[i] = 0;
            }
            sum += monsters[i];
        }
        System.out.println(sum);
    }
}
