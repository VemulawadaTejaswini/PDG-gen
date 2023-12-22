import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), q = scanner.nextInt();
        String s = scanner.next();
        List<Integer> ac = new ArrayList<>();
        for (int i = 1; i < n; i++)
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C')
                ac.add(i);
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt(), r = scanner.nextInt();
            int l1 = search(ac, l);
            int r1 = search(ac, r);
            System.out.println(r1 - l1);
        }
    }

    private static int search(List<Integer> list, int key) {
        int r = Collections.binarySearch(list, key);
        return r < 0 ? ~r : r;
    }
}