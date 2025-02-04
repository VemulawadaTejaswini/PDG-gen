import java.util.*;
import java.util.stream.*;

public class Main {
    private class Train {
        int parent;
        int cnt;

        public Train(int parent) {
            this.parent = parent;
            cnt = 1;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        int road[] = new int[n];
        init(n, road);
        for (int i = 0; i < k; i++) {
            link(sc.nextInt(), sc.nextInt(), road);
        }

        Train train[] = new Train[n];
        init(n, train);
        for (int i = 0; i < l; i++) {
            link(sc.nextInt(), sc.nextInt(), train, road);
        }

        System.out.println(Arrays.stream(train).map(t -> String.valueOf(train[t.parent - 1].cnt))
            .collect(Collectors.joining(" ")));
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

    public void init(int n, Train data[]) {
        for (int i = 0; i < n; i++) {
            data[i] = new Train(i + 1);
        }
    }

    public void link(int x, int y, Train data[], int sub[]) {
        if (isSame(x, y, sub)) {
            int rootx = root(x, data);
            int rooty = root(y, data);
            data[rootx - 1].parent = rooty;
            data[rooty - 1].cnt += data[rootx - 1].cnt;
        }
    }

    public int root(int p, Train data[]) {
        return (data[p - 1].parent == p) ? p
            : (data[p - 1].parent = root(data[p - 1].parent, data));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
