import java.util.*;

public class Main{
    
    static int n;
    static int m;
    static ArrayList<Integer>[] g;
    static boolean[] used;
    static int[] cmp;
    static ArrayList<Integer>[] cos;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i]= new ArrayList<Integer>();
        }
        
        used = new boolean[n];
        cmp = new int[n];
        
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            addEdge(x, y);
        }
        
        int k = scc();
        
        cos = new ArrayList[k];
        for(int i=0; i<k; i++){
            cos[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i<n; i++){
            cos[cmp[i]].add(a[i]);
        }
        
        if(k==1){
            System.out.println(0);
            return;
        }
        
        int cost = 0;
        
        ArrayList<Integer> nkr = new ArrayList<Integer>();
        for(int i=0; i<k; i++){
            Collections.sort(cos[i]);
            cost += cos[i].get(0);
            for(int j=1; j<cos[i].size(); j++){
                nkr.add(cos[i].get(j));
            }
        }
        
        int pick = k-2;
        if(pick <= nkr.size()){
            Collections.sort(nkr);
            
            for(int i=0; i<pick; i++){
                cost += nkr.get(i);
            }
            
            System.out.println(cost);
            
        }else{
            System.out.println("Impossible");
        }
    }
    
    public static int scc(){
        usedReset();
        
        int k =0;
        for(int i=0; i<n; i++){
            if(!used[i]) dfs(i, k++);
        }
        
        return k;
    }
    
    
    public static void usedReset(){
        Arrays.fill(used, false);
    }
    
    public static void addEdge(int from, int to){
        g[from].add(to);
        g[to].add(from);
    }
    
    public static void dfs(int v, int k){
        used[v] = true;
        cmp[v] = k;
        for(int i=0; i<g[v].size(); i++){
            if(!used[(int)g[v].get(i)]) dfs((int)g[v].get(i), k);
        }
    }
    
}
