import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        Tree trees[] = new Tree[N];
        int maxSides = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = new Tree();
        }

        for (int i = 0; i < N-1; i++) {
            a[i] = scan.nextInt() - 1;
            b[i] = scan.nextInt() - 1;
            trees[a[i]].addChild(b[i], i);
            trees[b[i]].addChild(a[i], i);

            if (maxSides < trees[a[i]].getChildrenNum())
                maxSides = trees[a[i]].getChildrenNum();
            if (maxSides < trees[b[i]].getChildrenNum())
                maxSides = trees[b[i]].getChildrenNum();
        }

        //K
        os.println(maxSides);

        int ans[] = new int[N-1];
        dfs(0, -1, -1, trees, ans);

        for(int i = 0; i < N-1; i++) {
            os.println(ans[i]);
        }
    }


    static void dfs(int to, int root, int rootColor, Tree[] trees, int[] ans) {
        int color = 1;
        for (Entry<Integer, Integer> entry: trees[to].getChildren().entrySet()) {
            Integer child = entry.getKey();
            if (child == root)
                continue;
            if(color == rootColor)
                color++;
            ans[entry.getValue()] = color;
            dfs(child, to, color++, trees, ans);
        }

    }


    static class Tree {
        HashMap<Integer, Integer> children = new HashMap<>();//tree番号、color番号

        Tree() {
        }

        void addChild(int num, int i) {
            children.put(num, i);
        }

        public int getChildrenNum() {
            return children.keySet().size();
        }

        HashMap<Integer, Integer> getChildren() {
            return children;
        }
    }
}