import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int m=Integer.parseInt(sc.next());
        ArrayList<Node> nodes=new ArrayList<Node>();
        HashSet<Pair> unused_edges=new HashSet<Pair>();
        nodes.add(new Node(0));
        for(int i=1;i<=n;i++){
            nodes.add(new Node(i));
        }
        for(int j=0;j<m;j++){
            int a=Integer.parseInt(sc.next());
            int b=Integer.parseInt(sc.next());
            int c=Integer.parseInt(sc.next());
            unused_edges.add(new Pair(a,b));
            nodes.get(a).edges.add(new Edge(b, c));
            nodes.get(b).edges.add(new Edge(a, c));
        }
        sc.close();
        for(int i=1;i<=n;i++){    
            nodes=Dijkstra.dijkstraAll(nodes, i);
            for(int j=1;j<=n;j++){
                Node node=nodes.get(j);
                if(i!=j) unused_edges.remove(new Pair(node.id, node.prev.id));
                node.prev=null;
                node.value=Integer.MAX_VALUE;
            }
        }
        System.out.println(unused_edges.size());
    }

    // public static ArrayList<Node> dijkstra(ArrayList<Node> nodes, int st){
    //     Node stNode=nodes.get(st);
    //     PriorityQueue<Node> pq=new PriorityQueue<Node>(new DistanceComparator());
    //     for(Node n:nodes){
    //         pq.add(n);
    //     }
    //     pq.remove(stNode);
    //     stNode.value=0;
    //     pq.add(stNode);
    //     while(pq.size()>0){
    //         Node seeing=pq.poll();           
    //         if(seeing.value==Integer.MAX_VALUE) return nodes;
    //         for(Edge e:seeing.edges){
    //             int newValue=seeing.value+e.c;
    //             Node next=nodes.get(e.id);
    //             if(newValue<next.value){
    //                 if(pq.remove(next)){
    //                     next.value=newValue;
    //                     next.prev=seeing;
    //                     pq.add(next);
    //                 }
    //             }
    //         }
    //     }
    //     return nodes;
    // }
    static class Dijkstra{
        public static ArrayList<Node> dijkstraAll(ArrayList<Node> nodes, int st){
            return dijkstra(nodes, st, -1);
            // Node stNode=nodes.get(st);
            // PriorityQueue<Node> pq=new PriorityQueue<Node>(new DistanceComparator());
            // for(Node n:nodes){
            //     pq.add(n);
            // }
            // pq.remove(stNode);
            // stNode.value=0;
            // pq.add(stNode);
            // while(pq.size()>0){
            //     Node seeing=pq.poll();           
            //     if(seeing.value==Integer.MAX_VALUE) return nodes;
            //     for(Edge e:seeing.edges){
            //         int newValue=seeing.value+e.c;
            //         Node next=nodes.get(e.id);
            //         if(newValue<next.value){
            //             if(pq.remove(next)){
            //                 next.value=newValue;
            //                 next.prev=seeing;
            //                 pq.add(next);
            //             }
            //         }
            //     }
            // }
            // return nodes;
        }
    
        public static ArrayList<Node> dijkstra(ArrayList<Node> nodes, int st, int ed){
            Node stNode=nodes.get(st);
            PriorityQueue<Node> pq=new PriorityQueue<Node>(new DistanceComparator());
            for(Node n:nodes){
                pq.add(n);
            }
            pq.remove(stNode);
            stNode.value=0;
            pq.add(stNode);
            while(pq.size()>0){
                Node seeing=pq.poll();           
                if(seeing.value==Integer.MAX_VALUE) return nodes;
                if(seeing.id==ed) return nodes;
                for(Edge e:seeing.edges){
                    int newValue=seeing.value+e.c;
                    Node next=nodes.get(e.id);
                    if(newValue<next.value){
                        if(pq.remove(next)){
                            next.value=newValue;
                            next.prev=seeing;
                            pq.add(next);
                        }
                    }
                }
            }
            return nodes;
        }
    }
    
    static class Node{
        int id;
        int value;
        Node prev;
        ArrayList<Edge> edges;
        public Node(int id){
            this.id=id;
            this.value=Integer.MAX_VALUE;
            edges=new ArrayList<Edge>();
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
        int c;
        public Edge(int id, int c){
            this.id=id;
            this.c=c;
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

