import java.util.*;

class UnionFind {
    static class RootInfo {
        int i;
        int depth;

        public RootInfo(int i, int depth) {
            this.i = i;
            this.depth = depth;
        }
    }

    int[] body; // This keeps parent number. If it has the index itself, it's a root.
    int h;

    public UnionFind(int h) {
        this.body = new int[h+1];
        this.h = h;
        for (int i = 1; i <= h; i++) {
            this.body[i] = i;
        }
    }

    public void dump() {
        for (int i = 1; i <= h; i++) {
            System.out.printf("%d, ", findGroup(i));
        }
        System.out.print("\n");
    }

    public void union(int i1, int i2) {
        RootInfo root1 = findRoot(i1);
        RootInfo root2 = findRoot(i2);
        if (root1.depth >= root2.depth) { // optimize
            this.body[root2.i] = root1.i;
        } else {
            this.body[root1.i] = root2.i;
        }
    }

    public int findGroup(int i) {
        RootInfo info = findRoot(i);
        return info.i;
    }

    private RootInfo findRoot(int i) {
        RootInfo info = findRootInternal(i);
        if (info.depth >= 2) { // optimize
            this.body[i] = info.i;
        }
        return info;
    }

    private RootInfo findRootInternal(int i) {
        int index = this.body[i];
        if (i == index) {
            return new RootInfo(i, 0);
        } else {
            RootInfo info = findRootInternal(index);
            info.depth += 1;
            return info;
        }
    }
}

class Main {
    static class Bridge {
        int a;
        int b;
        public Bridge(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ", 2);
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        long[] answers = new long[m];
        Bridge[] bridges = new Bridge[m];
        for (int i = 0; i < m; i++) {
            String[] ab = scanner.nextLine().split(" ", 2);
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            bridges[i] = new Bridge(a, b);
        }

        UnionFind unionFind = new UnionFind(n);
        //answers[m-1] = ((long)n * (long)(n-1)) / 2;

        for (int i = m - 1; i >= 0; i--) {
            Bridge bridge = bridges[i];

            //long aBefore = countUnion(unionFind, bridge.a, n);
            //long bBefore = countUnion(unionFind, bridge.b, n);
            //boolean abBefore = (unionFind.findGroup(bridge.a) == unionFind.findGroup(bridge.b));

            answers[i] = countComb(unionFind, n);
            unionFind.union(bridge.a, bridge.b);

            //long aAfter = countUnion(unionFind, bridge.a, n);
            //long bAfter = countUnion(unionFind, bridge.b, n);
            //boolean abAfter = (unionFind.findGroup(bridge.a) == unionFind.findGroup(bridge.b));

            //System.out.printf("===> aAfter:%d, aBefore:%d, bAfter:%d, bBefore:%d, abBefore:%b, abAfter:%b, (a:%d, b:%d)\n", aAfter, aBefore, bAfter, bBefore, abBefore, abAfter, bridge.a, bridge.b);
            //answers[i] = answers[i+1] - (aAfter - aBefore) - (bAfter - bBefore);
            //if (abAfter && !abBefore) {
            //    answers[i]++;
            //}
        }

        for (int i = 0; i < m; i++) {
            System.out.println(answers[i]);
        }
    }

    private static long countComb(UnionFind unionFind, int n) {
        long answer = 0;
        for (int i = 1; i <= n - 1; i++) {
            int aGroup = unionFind.findGroup(i);
            for (int j = i + 1; j <= n; j++) {
                if (unionFind.findGroup(j) != aGroup) answer++;
            }
        }
        return answer;
    }

    private static long countUnion(UnionFind unionFind, int a, int n) {
        long count = 0;
        int aGroup = unionFind.findGroup(a);
        for (int i = 1; i <= n; i++) {
            if (i != a && unionFind.findGroup(i) == aGroup) {
                count++;
            }
        }
        return count;
    }
}
