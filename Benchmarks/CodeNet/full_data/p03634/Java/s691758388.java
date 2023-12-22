import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    static HashMap<HashSet<Integer>,Long> map;
    static long[] distance;
    static ArrayList<ArrayList<Integer>> tree;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new HashMap<>();
        tree = new ArrayList<>();
        for(int i = 0; i < n; i++){
            tree.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < n - 1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();
            tree.get(a - 1).add(b - 1);
            tree.get(b - 1).add(a - 1);
            HashSet<Integer> set = new HashSet<>(Arrays.asList(a - 1, b - 1));
            map.put(set, c);
        }
        int q = sc.nextInt();
        int k = sc.nextInt();
        int[][] query = new int[q][2];
        for(int i = 0 ; i < q ; ++i){
            query[i][0] = sc.nextInt() - 1;
            query[i][1] = sc.nextInt() - 1;
        }
        sc.close();
        distance = new long[n];
        dfs(-1,k - 1,0);
        for(int i = 0; i < q; i++){
            System.out.println(distance[query[i][0]] + distance[query[i][1]]);
        }
        /*for(int i = 0; i < q; i++){
            System.out.println(query[i][0] + " " +query[i][1]);
        }*/
    }
    public static void dfs(int parent, int current, long dist){
        if(parent != -1) dist += map.get(new HashSet<>(Arrays.asList(parent, current)));
        for(int child : tree.get(current)){
            if(child != parent){
                dfs(current,child,dist);
            }
        }
        distance[current] = dist;
    }
}