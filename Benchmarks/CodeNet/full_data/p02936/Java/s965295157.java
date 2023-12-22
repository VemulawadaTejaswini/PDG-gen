import java.util.*;
 
public class Main {
    static List<List<Integer>> tree;
    static int[] score;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        tree = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            tree.get(a).add(b);
        }
        score = new int[n];
        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            int x = sc.nextInt();
            score[p] += x;
        }
        dfs(0);
        for (int i = 0; i < n; i++) {
            System.out.print(score[i]);
            System.out.print(' ');
        }
    }
    static void dfs(int v) {
        for (int i : tree.get(v)) {
            score[i] += score[v];
            dfs(i);
        }
    }
}
