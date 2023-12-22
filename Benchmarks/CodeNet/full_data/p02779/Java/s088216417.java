import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        if (set.size() == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}