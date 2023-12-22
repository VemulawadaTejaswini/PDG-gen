import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

class Pair<E extends Comparable<E>,F extends Comparable<F>> implements Comparable<Pair<E,F>>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }

    public int compareTo(Pair<E,F> another){
        if(this.getFirst().equals(another.getFirst())){
            return this.getSecond().compareTo(another.getSecond());
        }
        return this.getFirst().compareTo(another.getFirst());
    }

}

class Graph{
    int nodeNum;
    LinkedList<Integer>[] parents;
    LinkedList<Integer>[] children;
    Set<Integer> leaf;
    Set<Integer> top;

    public Graph(int nodeNum){
        this.nodeNum = nodeNum;
        this.parents = new LinkedList[nodeNum];
        this.children = new LinkedList[nodeNum];
        this.leaf = new HashSet<Integer>();
        this.top = new HashSet<Integer>();
        for(int n=0; n<nodeNum; n++){
            parents[n] = new LinkedList<>();
            children[n] = new LinkedList<>();
            leaf.add(n);
            top.add(n);
        }
    }
    public void addEdge(int parent, int child){
        children[parent].add(child);
        parents[child].add(parent);
        leaf.remove(parent);
        top.remove(child);
    }

    public LinkedList<Integer> topologicalSort(){
        LinkedList<Integer>[] p = new LinkedList[nodeNum];
        for(int n=0; n<nodeNum; n++) p[n] = new LinkedList<>(parents[n]);
        LinkedList<Integer>[] c = new LinkedList[nodeNum];
        for(int n=0; n<nodeNum; n++) c[n] = new LinkedList<>(children[n]);


        PriorityQueue<Integer> S = new PriorityQueue<>(top);
        LinkedList<Integer> L = new LinkedList<>();
        while(! S.isEmpty()){
            int n = S.poll();
            L.addLast(n);
            for(int m: children[n]){
                p[m].remove(new Integer(n));
                c[n].remove(new Integer(m));
                if(p[m].isEmpty()) S.add(m);
            }
        }
        return L;
    }


}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Graph graph = new Graph(N);
        for(int e=0; e<N+M-1; e++){
            graph.addEdge(sc.nextInt()-1, sc.nextInt()-1);
        }


        LinkedList<Integer> tp = graph.topologicalSort();
        //System.out.println(graph.topologicalSort());
        int[] parents = new int[N]; Arrays.fill(parents, -1);
        for(int n:tp){
            for(int m:graph.children[n]) parents[m]=n;
        }

        for(int n=0; n<N; n++) System.out.println(parents[n]+1);


    }
}
