import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt() - 1);
        }
        System.out.println(new Calculator(n, k, a).calculate());
    }
}

class Calculator {
    private int k;
    private List<List<Integer>> vec = new ArrayList<>();
    private int ans = 0;

    Calculator(int n, int k, List<Integer> a) {
        this.k = k;
        for (int i = 0; i < n; i++) {
            this.vec.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int j = a.get(i);
            if (i != 0) {
                this.vec.get(j).add(i);
            } else if (j != 0) {
                this.ans++;
            }
        }
    }

    int calculate() {
        dfs(0, 0);
        return this.ans;
    }

    private int dfs(int v, int pre) {
        int height = 0;
        for (int j : this.vec.get(v)) {
            height = Math.max(height, dfs(j, v));
        }
        if (pre != 0 && height == k - 1) {
            height = 0;
            this.ans++;
        } else {
            height++;
        }
        return height;
    }
}