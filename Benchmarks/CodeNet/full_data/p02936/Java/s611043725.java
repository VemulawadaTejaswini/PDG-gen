import java.util.*;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.ArrayList;

class Main{

    public static HashMap<Integer, ArrayList<Integer>> map;
    public static long[] ans;
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] p = new int[Q + 1];
        int[] x = new int[Q + 1];
        map = new HashMap<Integer, ArrayList<Integer>>();

        for(int i=1; i<N; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if(map.get(a[i])==null){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(b[i]);
                map.put(a[i], list);
            }
            else{
                ArrayList<Integer> list = map.get(a[i]);
                list.add(b[i]);
                map.put(a[i], list);
            }
            if(map.get(b[i])==null){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(a[i]);
                map.put(b[i], list);
            }
            else{
                ArrayList<Integer> list = map.get(b[i]);
                list.add(a[i]);
                map.put(b[i], list);
            }
        }
        ans = new long[N + 1];
        for(int i=1; i<=Q; i++){
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
            ans[p[i]] += x[i];
        }
        dfs(1, -1);
        System.out.print(ans[1]);
        for(int i=2; i<=N; i++){
            System.out.print(" " + ans[i]);
        }
        System.out.println("");
    }

    public static void dfs(int root, int parent){
        ArrayList<Integer> list = map.get(root);
        if(list==null){
            return;
        }
        for(int j: list){
            if(j==parent){
                continue;
            }
            ans[j] += ans[root];
            dfs(j, root);
        }
    }
}