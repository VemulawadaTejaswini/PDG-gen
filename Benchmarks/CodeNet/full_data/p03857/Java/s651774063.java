package atc;

import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        int road[] = new int[n];
        init(n, road);
        for (int i = 0; i < k; i++) {
            link(sc.nextInt(), sc.nextInt(), road);
        }

        int train[] = new int[n];
        init(n, train);
        for (int i = 0; i < l; i++) {
            link(sc.nextInt(), sc.nextInt(), train);
        }

        int links[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (links[i] != 0) {
                continue;
            }

            int cnt = 0;
            List<Integer> targetList = new ArrayList<>();
            for (int j = i; j < n; j++) {
                if (isSame(i + 1, j + 1, road) && isSame(i + 1, j + 1, train)) {
                    cnt++;
                    targetList.add(j);
                }
            }

            for (int target : targetList) {
                links[target] = cnt;
            }
        }

        System.out.println(Arrays.toString(links).replaceAll("\\[|\\]|,", ""));
    }

    public void init(int n, int data[]) {
        for (int i = 0; i < n; i++) {
            data[i] = i + 1;
        }
    }

    public void link(int x, int y, int data[]) {
        data[root(x, data) - 1] = root(y, data);
    }

    public boolean isSame(int x, int y, int data[]) {
        return root(x, data) == root(y, data);
    }

    public int root(int p, int data[]) {
        return (data[p - 1] == p) ? p : (data[p - 1] = root(data[p - 1], data));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
