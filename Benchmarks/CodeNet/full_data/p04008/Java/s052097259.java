import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.Inflater;

public class Main {
    public static void main(String args[]) {
        int n;
        int k;
        List<Integer> as = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                as.add(sc.nextInt() - 1);
            }
        }
        System.out.println(new Calculator(n, k, as).calculate());
    }
}

class Calculator {
    private int k;
    private int answer = 0;
    private boolean isCalculate = false;
    private List[] lists;

    Calculator(int n, int k, List<Integer> as) {
        this.k = k;
        this.lists=new List[n];
        for (int i = 0; i < n; i++) {
            this.lists[i]=new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            int j = as.get(i);
            if (0 < i) {
                this.lists[j].add(i);
            } else if (0 < j) {
                this.answer++;
            }
        }
    }

    int calculate() {
        if (!this.isCalculate) {
            this.dfs(0, 0);
            this.isCalculate = true;
        }
        return this.answer;
    }

    private int dfs(int a, int pre) {
        int h = 0;
        for (Object i : this.lists[a]) {
            h = Math.max(h, this.dfs((int)i, a));
        }
        if (0 < pre && h == this.k - 1) {
            h = 0;
            this.answer++;
        } else {
            h++;
        }
        return h;
    }
}