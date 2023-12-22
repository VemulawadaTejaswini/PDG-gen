import java.util.*;

public class Main{
//     5
// 1 2 1
// 1 3 1
// 2 4 1
// 3 5 1
// 3 1
// 2 4
// 2 3
// 4 5
    public static void main(String[] args){
        ArrayList<Node> nodes=new ArrayList<Node>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int a,b;
        long c;
        for(int i=0;i<n;i++) nodes.add(new Node(i));
        for(int i=0;i<n-1;i++){
            a=Integer.parseInt(sc.next())-1;
            b=Integer.parseInt(sc.next())-1;
            c=Long.parseLong(sc.next());
            nodes.get(a).edges.add(new Edge(b,c));
            nodes.get(b).edges.add(new Edge(a,c));
        }
        int q=Integer.parseInt(sc.next());
        int k=Integer.parseInt(sc.next())-1;
        long afterK[]=Dijkstra.dijkstra(nodes, k);
        for(Node node:nodes) node.reset();
        int x,y;
        for(int j=0;j<q;j++){
            x=Integer.parseInt(sc.next())-1;
            y=Integer.parseInt(sc.next())-1;
            System.out.println(Dijkstra.dijkstra(nodes, x)[k]+afterK[y]);
            for(Node node:nodes){
                node.reset();
                // System.out.println("id:"+node.id+" value:"+node.value);
            }           
            // for(int i=0;i<n;i++) System.out.println(afterK[i]);
        }
        sc.close();
    }
    static class Dijkstra{
        public static long[] dijkstra(ArrayList<Node> nodes, int st){
            return dijkstra(nodes, st, -1);
        }   
        public static long[] dijkstra(ArrayList<Node> nodes, int st, int ed){
            long[] res=new long[nodes.size()];
            Node stNode=nodes.get(st);
            PriorityQueue<Node> pq=new PriorityQueue<Node>(new DistanceComparator());
            for(Node n:nodes){
                pq.add(n);
                res[n.id]=Long.MAX_VALUE;
            }
            pq.remove(stNode);
            stNode.value=0;
            res[st]=0;
            pq.add(stNode);
            Node seeing, next;
            long newValue;
            while(pq.size()>0){
                seeing=pq.poll();           
                if(seeing.value==Long.MAX_VALUE) return res;
                if(seeing.id==ed) return res;               
                for(Edge e:seeing.edges){
                    newValue=seeing.value+e.cost;
                    next=nodes.get(e.id);
                    if(newValue<next.value){
                        res[e.id]=newValue;
                        if(pq.remove(next)){
                            next.value=newValue;
                            next.prev=seeing;
                            pq.add(next);
                        }
                    }
                }
            }
            return res;
        }
    }
    static class Node{
        int id;
        long value;
        Node prev;
        ArrayList<Edge> edges;
        public Node(int id){
            this.id=id;
            this.value=Long.MAX_VALUE;
            edges=new ArrayList<Edge>();
        }
        public void reset(){
            this.value=Long.MAX_VALUE;
            this.prev=null;
        }
        @Override public boolean equals(Object o){
            if(! (o instanceof Node)) return false;
            Node n=(Node) o;
            if(n.id==id) return true;
            else return false;
        }
        @Override public int hashCode(){
            return id;
        }
    }

    static class Edge{
        int id;;
        long cost;
        public Edge(int id, long cost){
            this.id=id;
            this.cost=cost;
        }
    }

    static class Pair{
        int id1;
        int id2;
        public Pair(int id1, int id2){
            this.id1=id1;
            this.id2=id2;
        }
        @Override public boolean equals(Object o){
            if(! (o instanceof Pair)) return false;
            Pair p=(Pair) o;
            if((p.id1==id1 && p.id2==id2) || (p.id1==id2 && p.id2==id1)) return true;
            else return false;
        }
        @Override public int hashCode(){
            int res=17;
            res=((res*31+id1)*31+id2)+((res*31+id2)*31+id1);
            return 0;
        }
    }

    static class DistanceComparator implements Comparator<Node>{
        @Override public int compare(Node a, Node b){
            if(a.value<b.value) return -1;
            else if(a.value>b.value) return 1;
            else return 0;
        }
    }
}