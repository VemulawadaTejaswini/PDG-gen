import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node[] nodes = new Node[N];
        for(int i = 0; i < N; i++){
            nodes[i] = new Node(i);
        }
        
        for(int i = 0; i < N - 1; i++){
            int v1 = sc.nextInt() - 1;
            int v2 = sc.nextInt() - 1;
            int w  = sc.nextInt();
            
            nodes[v1].adjacents.put(nodes[v2], w);
            nodes[v2].adjacents.put(nodes[v1], w);
        }
        
        bfs(nodes[0]);
        
        for(Node n : nodes){
            System.out.println(n.color);
        }

    }
    
    public static void bfs(Node n0){
        
        Queue<Node> queue = new LinkedList<>();
        
        n0.color = 0;
        queue.add(n0);
        
        while(!queue.isEmpty()){
            
            Node n = queue.poll();
            
            for( Node na : n.adjacents.keySet() ){
                if( na.color != -1 ) continue;
                
                int na_kyori = n.adjacents.get(na);
                if ( na_kyori % 2 == 0 ){
                    na.color = n.color % 2;
                } else {
                    na.color = (n.color + 1) % 2;
                }
                
                queue.add(na);
                
            }
        }
    }
    
    static class Node{
        int id;
        // 白 : 0、 黒 : 1
        int color = -1;
        Map<Node, Integer> adjacents = new HashMap<>();
        
        public Node(int id){
            this.id = id;
        }
    }
}
