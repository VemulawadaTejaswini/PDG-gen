import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> fromList = new ArrayList<>();
        List<Integer> toList = new ArrayList<>();
        for(int i = 0;i < m;i++){
            fromList.add(sc.nextInt());
            toList.add(sc.nextInt());
        }



        List<Long> ans = new ArrayList<>();
        ans.add((long)n*(n-1)/2);
        UnionFindTree uft = new UnionFindTree(n+1);
        for(int i = m-1;i >= 1;i--){
            int from = fromList.get(i);
            int to = toList.get(i);
            if(uft.same(from, to)){
                ans.add(ans.get(m-i-1));
            } else {
                ans.add(Math.max(ans.get(m - i - 1) - (long)uft.size(from) * uft.size(to), 0));
                uft.union(from, to);
            }
        }

        for(int i = m-1;i >= 0;i--){
            System.out.println(ans.get(i));
        }
    }

    public static class UnionFindTree {

        int[] parent;
        int[] size;
        int[] rank;

        public UnionFindTree(int size) {
            this.parent = new int[size];
            this.rank = new int[size];
            this.size = new int[size];

            for (int i = 0; i < size; i++) {
                makeSet(i);
            }
        }

        public void makeSet(int i) {
            parent[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }

        public void union(int x, int y) {
            int xRoot = find(x);
            int yRoot = find(y);

            if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
                size[xRoot] += size[yRoot];
            } else if (rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
                size[yRoot] += size[xRoot];
            } else if (xRoot != yRoot) {
                parent[yRoot] = xRoot;
                size[xRoot] += size[yRoot];
                rank[xRoot]++;
            }
        }

        public int find(int i) {
            if (i != parent[i]) {
                parent[i] = find(parent[i]);
            }
            return parent[i];
        }

        public int size(int i){
            return size[find(i)];
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }
    }
}