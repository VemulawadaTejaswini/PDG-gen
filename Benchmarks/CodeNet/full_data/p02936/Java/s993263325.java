import java.util.*;

public class Main {
    
    static Node[] nodes;
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        nodes = new Node[N];
        
        for(int i = 0; i < N; i++){
            nodes[i] = new Node();
        }
        
        for(int i = 0; i < N - 1; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            nodes[a].add(nodes[b]);
            nodes[b].add(nodes[a]);
        }
        
        // parentを設定
        dfs(nodes[0], null);
        
        for(int i = 0; i < Q; i++){
            int p = sc.nextInt() - 1;
            int x = sc.nextInt();
            nodes[p].cnt += x;
        }
        
        sum(nodes[0]);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            sb.append(nodes[i].cnt);
            if( i != N - 1) sb.append(" ");
        }
        
        System.out.println(sb);
        
    }
    
    private static void sum(Node c){
        if( c.parent != null ){
            c.cnt += c.parent.cnt;
        }
        
        for( Node cc : c ){
            if ( cc != c.parent) {
                sum(cc);
            }
        }
    }
    
    private static void dfs(Node c, Node parent){
        c.parent = parent;
        for(Node cc : c){
            if ( cc != parent) {
                dfs(cc, c);
            }
        }
    }
    
    static class Node extends ArrayList<Node>{
        Node parent;
        int cnt = 0;
    }
}
