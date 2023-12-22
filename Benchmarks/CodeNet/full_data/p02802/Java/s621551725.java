import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int penalty = 0;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            String result = sc.next();
            if ("AC".equals(result)) {
                set.add(x);
            } else {
                if (!set.contains(x)) {
                    penalty++;
                }
            }
        }
        System.out.println(set.size() + " " + penalty);
    }
}