import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static List<Integer> permList = new ArrayList<>();

    private static void permutation(int n, Set<Integer> set, int num) {
        if (String.valueOf(num).length() >= n) {
            permList.add(num);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            set.add(i);
            permutation(n, set, num * 10 + i);
            set.remove(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }

        int pnum = 0;
        int qnum = 0;
        for (int i = 0; i < n; i++) {
            pnum += p[i] * Math.pow(10, n - i - 1);
            qnum += q[i] * Math.pow(10, n - i - 1);
        }

        permutation(n, new HashSet<>(), 0);
        int a = 0;
        int b = 0;
        for (int i = 0; i < permList.size(); i++) {
            if (pnum == permList.get(i)) {
                a = i;
            }
            if (qnum == permList.get(i)) {
                b = i;
            }
        }
        System.out.println(Math.abs(a - b));
    }

}
