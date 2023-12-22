import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[m];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }
        
        int cost1 = 0;
        for (int i = x; i <= n; i++) {
            if (set.contains(i)) cost1++;
        }

        int cost2 = 0;
        for (int i = x; i >= 0; i--) {
            if (set.contains(i)) cost2++;
        }

        System.out.println(Math.min(cost1, cost2));
        
    }
}