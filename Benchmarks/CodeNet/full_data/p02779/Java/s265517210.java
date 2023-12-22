import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int now = 0;
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            now = sc.nextInt();
            if (c.contains(now)) {
                System.out.println("NO");
                System.exit(0);
            } else {
                c.add(now);
            }
        }
        System.out.println("YES");
    }
}