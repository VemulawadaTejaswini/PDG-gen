import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class Graph{
    LinkedList<Integer> edgeList [];
    int eachVertexLP[] ;
    Graph(int v) {
        edgeList = new LinkedList[v];
        eachVertexLP = new int[v];
        for(int i=0;i<v;i++) {
            edgeList[i] = new LinkedList<>();
            eachVertexLP[i] = -1;
        }
    }

    void addEdges(int s, int d) {
        edgeList[s].add(d);
    }

    void printGraph (int v) {
        for(int i=0;i<v;i++) {
            System.out.print(i + " -> ");
            for(int j=0;j<edgeList[i].size();j++) {
                System.out.print(edgeList[i].get(j) + " -> ");
            }
            System.out.println();
        }
    }
    int longPath(int v) {
        int max = Integer.MIN_VALUE;
        LinkedList<Integer> linkedList = edgeList[v];
        //System.out.println( " ll " + linkedList);
        for(int i=0;i<linkedList.size();i++) {
            //System.out.println("inside for loop ");
            LinkedList<Integer> linkedList2 = edgeList[linkedList.get(i)];
            if(linkedList2.size() == 0) {
                //System.out.println("empty ll");
                eachVertexLP[linkedList.get(i)] = 0;
            }
            if(eachVertexLP[linkedList.get(i)] != -1) {
                max = Math.max(eachVertexLP[linkedList.get(i)], max);
                //System.out.println("direct max " + max +" linkedList.get(i) " + linkedList.get(i));
            }
            else {
                eachVertexLP[linkedList.get(i)] = 1 + Math.max(longPath(linkedList.get(i)), max);
                max = eachVertexLP[linkedList.get(i)];
                //System.out.println("indirect max " + max + " linkedList.get(i) " + linkedList.get(i));
            }
        }

        return max;
    }

    void longestpathUtils(int v) {
        for(int i=0;i<v;i++) {
            if(eachVertexLP[i] == -1) {
                LinkedList<Integer> linkedList = edgeList[i];
                if(linkedList.size() == 0) {
                    eachVertexLP[i] = 0;
                }
                else eachVertexLP[i] = 1+longPath(i);
            }
        }
    }
}

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Graph graph = new Graph(n);
        while(m -- >0) {
            int s = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;
            graph.addEdges(s, d);
        }
        //graph.printGraph(n);
        graph.longestpathUtils(n);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            max = Math.max(max, graph.eachVertexLP[i]);
        }
        System.out.println(max);
    }
}
