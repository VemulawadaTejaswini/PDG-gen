import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if (list.contains(k)) {
            System.out.println("POSSIBLE");
            return;
        }
        Collections.sort(list);
        if (k > list.get(n - 1) || n == 1) {
            System.out.println("IMPOSSIBLE");
            return;
        }
        int min = list.get(0);
        long gcd = gcd(min, list.get(1));
        for (int i = 2; i < n; i++) {
            gcd = gcd(gcd, list.get(i));
        }
        System.out.println(k % gcd == 0 ? "POSSIBLE" : "IMPOSSIBLE");
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}