import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        Node[] nodes=new Node[k];
        for(int i=0;i<k;nodes[i]=new Node(i++));
        for(int i=1;i<k;i++){
            nodes[i].edges.add(new Edge((i*10)%k, 0));
            nodes[i].edges.add(new Edge((i+1)%k, 1));
        }
        System.out.println(_01bfs(nodes, 1)[0]+1);
    }

    public static int[] _01bfs(Node[] nodes, int s) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(s);
        int n = nodes.length;
        int[] d = new int[n];
        for (int i = 0; i < n; d[i++] = -1) ;
        d[s] = 0;
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            for (Edge e : nodes[now].edges) {
                int next = e.id;
                int cost = e.cost;
                if (d[next] < 0) {
                    if (cost == 0) {
                        dq.addFirst(next);
                    } else {
                        dq.addLast(next);
                    }
                    d[next] = d[now] + cost;
                }
            }
        }
        return d;
    }

    static class Node {
        int id;
        int value;
        ArrayList<Edge> edges;

        public Node(int id) {
            this.id = id;
            this.value = Integer.MAX_VALUE;
            edges = new ArrayList<Edge>();
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Node))
                return false;
            Node n = (Node) o;
            if (n.id == id)
                return true;
            else
                return false;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    static class Edge {
        int id;
        int cost;
        public Edge(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
    }
}
