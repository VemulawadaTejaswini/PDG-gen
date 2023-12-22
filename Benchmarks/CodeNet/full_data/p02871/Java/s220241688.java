import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    static int V;
    static Map<Integer, Map<Integer, Integer>> graph;
    static int[] deliver;
    static ArrayDeque<Move> path;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        
        Edge[] e = new Edge[E];
        for(int i = 0; i < E; i++){
            e[i] = new Edge(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        Arrays.sort(e);
        
        graph = new HashMap<>();
        for(int i = 0; i < E; i++){
            int u = e[i].u;
            int v = e[i].v;
            int d = e[i].d;
            
            if(!graph.containsKey(u)){
                Map<Integer, Integer> edge = new LinkedHashMap<>();
                graph.put(u, edge);
            }
            graph.get(u).put(v, d);
            
            if(!graph.containsKey(v)){
                Map<Integer, Integer> edge = new LinkedHashMap<>();
                graph.put(v, edge);
            }
            graph.get(v).put(u, d);
        }
        
        int tMax = Integer.parseInt(sc.next());
        int[] info = new int[tMax];
        for(int i = 0; i < tMax; i++){
            int nNew = Integer.parseInt(sc.next());
            if(nNew == 1){
                int id = Integer.parseInt(sc.next());
                info[i] = Integer.parseInt(sc.next());
            }
        }
        
        ArrayDeque<Integer> order = new ArrayDeque<>();
        int orderNum = 0;
        deliver = new int[V+1];
        int deliverNum = 0;
        int pos = 1;
        path = new ArrayDeque<>();
        StringBuilder command = new StringBuilder();
        final int SHOP = 1;
        final int EDGE = 0;
        boolean returnToShop = false;
        
        for(int t = 0; t < tMax; t++){
            if(info[t] != 0){
                order.add(info[t]);
                orderNum++;
            }
            if(!path.isEmpty()){
                if(path.peek().cost == 1){
                    pos = path.poll().to;
                }else{
                    path.peek().cost--;
                    pos = EDGE;
                }
            }
            if(t == 9400) returnToShop = true;
            
            if(pos == SHOP){
                path.clear();
                while(!order.isEmpty()){
                    deliver[order.poll()]++;
                    deliverNum++;
                }
                orderNum = 0;
                if(deliverNum == 0){
                    command.append(-1);
                }else{
                    setPath(pos, -1);
                    command.append(path.peek().to);
                }
            }else if(pos == EDGE){
                command.append(path.peek().to);
            }else{
                if(deliver[pos] != 0){
                    deliverNum -= deliver[pos];
                    deliver[pos] = 0;
                }
                if(returnToShop){
                    path.clear();
                    setPath(pos, SHOP);
                    returnToShop = false;
                }else if(path.isEmpty()){
                    if(deliverNum == 0 || orderNum > deliverNum*8){
                        setPath(pos, SHOP);
                    }else{
                        setPath(pos, -1);
                    }
                }
                command.append(path.peek().to);
            }
            command.append(System.lineSeparator());
        }
        
        System.out.print(command);
    }
    
    static void setPath(int from, int to){
        
        int[] visitFrom = new int[V+1];
        Arrays.fill(visitFrom, -1);
        ArrayDeque<Integer> que = new ArrayDeque<>();
        visitFrom[from] = 0;
        que.add(from);
        
        while(true){
            int v = que.poll();
            if((to == -1 && deliver[v] != 0) || v == to){
                while(visitFrom[v] != 0){
                    int cost = graph.get(visitFrom[v]).get(v);
                    path.addFirst(new Move(v, cost));
                    v = visitFrom[v];
                }
                return;
            }
            
            Map<Integer, Integer> edge = graph.get(v);
            for(int node : edge.keySet()){
                if(visitFrom[node] < 0){
                    visitFrom[node] = v;
                    que.add(node);
                }
            }
        }
    }
    
    static class Edge implements Comparable<Edge>{
        int u;
        int v;
        int d;

        public Edge(int u, int v, int d) {
            this.u = u;
            this.v = v;
            this.d = d;
        }
        
        @Override
        public int compareTo(Edge e) {
            return this.d - e.d;
        }
    }
    
    static class Move {
        int to;
        int cost;

        public Move(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}