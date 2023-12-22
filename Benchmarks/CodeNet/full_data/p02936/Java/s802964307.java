import java.util.*;
 
public class Main {
    static Node[] to;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        to = new Node[n];
        ans = new int[n];
        boolean[] wasCreated = new boolean[n];
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if(wasCreated[a]){
                to[a].arr.add(b);
            }else{
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(b);
                to[a] = new Node(arr);
                wasCreated[a] = true;
            }
            if(wasCreated[b]){
                to[b].arr.add(a);
            }else{
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(a);
                to[b] = new Node(arr);
                wasCreated[b] = true;
            }
        }
        for(int i = 0; i < q; i++){
            int p = sc.nextInt()-1;
            int x = sc.nextInt();
            ans[p] += x;
        }
        dfs(0,-1);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
    public static void dfs(int v, int p){
        for(int u : to[v].arr){
            if(u == p) continue;
            ans[u] += ans[v];
            dfs(u,v);
        }
    }
}

class Node{
    ArrayList<Integer> arr;
    public Node(ArrayList<Integer> arr){
        this.arr = arr;
    }
}
