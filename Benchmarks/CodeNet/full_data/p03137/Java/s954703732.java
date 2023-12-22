import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        if (n >= m) {
            System.out.println(0);
            return;
        }
        Arrays.sort(x);
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i < m; i++) {
            l.add(x[i] - x[i - 1]);
        }
        Collections.sort(l);
        int ans = x[m - 1] - x[0];
        for (int i = 0; i < n - 1; i++) {
            // System.out.println(l.get(l.size() - 1 - i));
            ans -= l.get(l.size() - 1 - i);
        }
        System.out.println(ans);
    }

}
