import java.util.*;
 
public class Main {
    static ArrayList<ArrayList<Integer>> to = new ArrayList<>();
    static int[] ans;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ans = new int[n];
        for(int i = 0; i < n; i++){
            to.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            to.get(a).add(b);
            to.get(b).add(a);
        }
        for(int i = 0; i < q; i++){
            int p = sc.nextInt()-1;
            int x = sc.nextInt();
            ans[p] += x;
        }
        dfs(0,-1,0);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
    public static void dfs(int v, int p, int counter){
        for(int u : to.get(v)){
            if(u == p) continue;
            dfs(u,v,counter+ans[v]);
        }
        ans[v] += counter;
    }
}
