import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        Map<Cost,Cost> cmap = new HashMap<>();
        PathMap pmap = new PathMap();
        
        for(int i = 0; i < N-1; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long c = scanner.nextInt();
            Cost cost = new Cost(a,b,c);
            cmap.put(cost,cost);
            pmap.put(cost);
        }
        int Q = scanner.nextInt();
        int K = scanner.nextInt();
        
        Map<Integer,Node> nodemap = new HashMap<>();
        makeTree(K,-1,nodemap,cmap,pmap);
        
        for(int i = 0; i < Q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(nodemap.get(a).costFromRoot + nodemap.get(b).costFromRoot);
        }
        
    }
    
    static void makeTree(int current, int parent, Map<Integer,Node> nodemap, Map<Cost,Cost> costmap, PathMap pathmap){
        Node node = new Node();
        node.n = current;
        node.parent = parent;
        if(parent == -1){
            node.level = 0;
            node.costFromRoot = 0;
        }else{
            node.level = nodemap.get(parent).level + 1;
            node.costFromRoot = nodemap.get(parent).costFromRoot 
                                + costmap.get(new Cost(parent,current,0)).cost;
        }
        nodemap.put(current,node);
        for(int n: pathmap.getOtherNodes(current)){
            if(n != parent)
                makeTree(n,current,nodemap,costmap,pathmap);
        }
    }
}

class PathMap {
    Map<Integer,List<Cost>> map = new HashMap<>();
    void put(Cost obj){
        if(!map.containsKey(obj.self))
            map.put(obj.self, new ArrayList<Cost>());
        if(!map.containsKey(obj.other))
            map.put(obj.other, new ArrayList<Cost>());
        map.get(obj.self).add(obj);
        map.get(obj.other).add(obj);
    }
    
    int[] getOtherNodes(int n){
        List<Cost> clist = map.get(n);
        int size = clist.size();
        int[] res = new int[size];
        for(int i = 0; i < size; i++){
            Cost c = clist.get(i);
            res[i] = c.self == n ? c.other : c.self;
        }
        return res;
    }
}

class Node {
    int n = -1;
    int parent = -1;
    //Set<Integer> children = new HashSet();
    int level = -1;
    long costFromRoot = -1;
}

class Cost {
    int self = -1;
    int other = -1;
    long cost = -1;
    Cost(int a, int b, long c){
        self = a; other = b; cost = c;
    }
    @Override
    public int hashCode(){
        return this.self + this.other;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Cost){
            Cost o = (Cost)obj;
            if(o.self == this.self && o.other == this.other){
                return true;
            }else if(o.self == this.other && o.other == this.self){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
