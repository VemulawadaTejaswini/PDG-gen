import java.util.*;

public final class Main {


    static int N;

    static int M;


    static long pivot = Long.MAX_VALUE - 100;

    public static void connect(Node from ,Node to , int num) {

        Edge e=  new Edge(from, to,num);

        from.childs.add(e);

        to.parents.add(e);
    }
    static class Node {

        List<Edge> childs = new LinkedList<>();

        List<Edge> parents = new LinkedList<Edge>();
        int index;


        public Node(int index) {

            this.index = index;
        }

    }

    static class Edge {

        Node from;

        Node to;

        int num;

        public Edge( Node from, Node to ,int num) {

            this.from = from;
            this.to = to;

            this.num = num;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        M = s.nextInt();

        Node[] nodes = new Node[N+1];

        for (int i = 1; i <= N; i++) {

            nodes[i] = new Node(i);
        }

        for (int i = 0; i  < M; i++) {


            int a = s.nextInt();

            int b = s.nextInt();

            int w = s.nextInt();

            boolean check[] = new boolean[N + 1];

            long result = dfs(nodes[a], b, check);

            if (result > pivot) {


                connect(nodes[a], nodes[b], w);

            } else {

                if (result == w) {
                    continue;
                }

                else  {

                    System.out.print("No");

                    return;
                }
            }
        }

        System.out.print("Yes");

    }


    public  static long dfs(Node n1, int index, boolean[] check) {

        if (n1.index == index ) {
            return 0;
        }

       // System.out.println("searching " + n1.index);

        if (n1.childs.isEmpty() && n1.parents.isEmpty()) return Long.MAX_VALUE;

        long result = Long.MAX_VALUE;

        check[n1.index] = true;

        for (Edge e : n1.childs) {

            Node k = e.to;

            if (check[k.index] == true) continue;

            if (k.index == n1.index) continue;

            int localw = e.num;

            long re=dfs(k, index, check);

            if (re  < pivot)  result = re+ localw;
        }

        for (Edge e : n1.parents) {

            Node k = e.from;

            if (check[k.index] == true) continue;

            if (k == n1) continue;

            int localw = -e.num;

            long re=dfs(k, index, check);

            if (re  < pivot) result = re + localw;
        }

        check[n1.index] = false;

        return result;
    }

}