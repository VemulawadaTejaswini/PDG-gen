import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int dist = Math.abs(x.get(i)) + Math.abs(x.get(i + k - 1) - x.get(i));
            min = Math.min(min, dist);
        }
        System.out.println(min);
    }
}
