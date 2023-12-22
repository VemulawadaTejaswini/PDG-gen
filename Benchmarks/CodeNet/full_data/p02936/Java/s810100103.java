import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List[] nodeList = new List[n];
        for (int i = 0; i < n; i++) {
            nodeList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            nodeList[a].add(b);
        }

        int[] ans = new int[n];
        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            int x = sc.nextInt();

            counter(p, x, ans, nodeList);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static void counter(int p, int x, int[] ans, List[] list) {
        ans[p] += x;
        for (int j = 0; j < list[p].size(); j++) {
            counter((int)list[p].get(j), x, ans, list);
        }
    }
}