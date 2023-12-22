import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static int[] check;
    public static ArrayList<Integer>[] ar;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        ar = new ArrayList[n + 1];
        int[] a = new int[m];
        int[] b = new int[m];
        check = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            ar[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            ar[a[i]].add(b[i]);
            ar[b[i]].add(a[i]);
        }
        long ans = 0;
        for (int i = 0; i < m; i++) {
            int s = a[i];
            int g = b[i];
            ar[s].remove(0);
            ar[g].remove(0);
            long ss = count(s);
            long gg = count(g);
            if (check[s] == 0) {
                ans += ss * gg;
            }

            System.out.println(ans);
        }

        sc.close();
    }

    public static long count(int pos) {
        long ans = 0;
        Arrays.fill(check, 0);
        dfs(pos);
        for (int i = 0; i < n + 1; i++) {
            if (check[i] != 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void dfs(int pos) {
        check[pos] = 1;
        for (int i = 0; i < ar[pos].size(); i++) {
            int next = ar[pos].get(i);
            if (check[next] == 0) {
                dfs(next);
            }
        }
    }
}