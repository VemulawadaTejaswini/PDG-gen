import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        HashSet<Integer>[] friends = new HashSet[n];
        HashSet<Integer>[] blocks = new HashSet[n];
        for (int i = 0; i < n; i++) {
            friends[i] = new HashSet<>();
            blocks[i] = new HashSet<>();
        }
        UnionFindTree uft = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            friends[Math.min(a, b)].add(Math.max(a, b));
            uft.unite(a, b);
        }
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            blocks[Math.min(a, b)].add(Math.max(a, b));
        }
        int[] counts = new int[n];
        HashMap<Integer, ArrayList<Integer>> map = uft.getSet();
        for (ArrayList<Integer> list : map.values()) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (!friends[list.get(i)].contains(list.get(j)) && !blocks[list.get(i)].contains(list.get(j))) {
                        counts[list.get(i)]++;
                        counts[list.get(j)]++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(counts[i]);
        }
		System.out.println(sb);
   }
    
    static class UnionFindTree {
        int[] parents;
        
        public UnionFindTree(int size) {
            parents = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
            }
        }
        
        public int find(int x) {
            if (parents[x] == x) {
                return x;
            } else {
                return parents[x] = find(parents[x]);
            }
        }
        
        public void unite(int x, int y) {
            int xx = find(x);
            int yy = find(y);
            if (xx == yy) {
                return;
            }
            parents[xx] = yy;
        }
        
        public HashMap<Integer, ArrayList<Integer>> getSet() {
            HashMap<Integer, ArrayList<Integer>> ans = new HashMap<>();
            for (int i = 0; i < parents.length; i++) {
                int x = find(i);
                if (ans.containsKey(x)) {
                    ans.get(x).add(i);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    ans.put(x, list);
                }
            }
            return ans;
        }
    }

}
