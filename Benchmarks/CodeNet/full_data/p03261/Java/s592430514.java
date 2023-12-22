import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] w = new int[100010];
    static int[] v = new int[100010];
    static int[][] dp = new int[110][100010];
    static int k;

    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return a;
        }
        return a;
    }

    static int chmax(int a, int b) {
        if (a < b) {
            a = b;
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String w = sc.next();
            if (i != 0) {
                String prev = list.get(i - 1);
                if (list.contains(w) || prev.charAt(prev.length() - 1) != w.charAt(0)) {
                    System.out.println("No");
                    return;
                }
            }
            list.add(w);
        }
        System.out.println("Yes");

    }
}
