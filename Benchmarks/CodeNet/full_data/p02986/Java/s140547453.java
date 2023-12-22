

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Branch branches[] = new Branch[N-1];

        Edge allEdge[] = new Edge[N-1];
        Node allNode[] = new Node[N];
        for (int i=0;i<N;i++) {
            allNode[i] = new Node();
            allNode[i].id = i+1;
        }

        Map<Integer, List<Integer>> bMap = new HashMap<>();

        ArrayList<Integer> a;
        for(int i=0;i<N-1;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

//            System.out.println(l + ", " + r + ", " + c + ", " + d);
//            branches[i] = new Branch();
//            branches[i].left = l;
//            branches[i].right = r;
//            branches[i].color = c;
//            branches[i].distance = d;

            allEdge[i] = new Edge();
            allEdge[i].color = c;
            allEdge[i].distance = d;
            allEdge[i].left = l;
            allEdge[i].right = r;

            allNode[l-1].childEdge.add(allEdge[i]);
            allNode[l-1].child.add(allNode[r-1]);
            allNode[r-1].childEdge.add(allEdge[i]);
            allNode[r-1].child.add(allNode[l-1]);

//            a = (ArrayList<Integer>) bMap.get(branches[i].left);
//            if (a==null) { a = new ArrayList<>(); }
//            a.add(i);
//            bMap.put(branches[i].left, a);
//            a = (ArrayList<Integer>) bMap.get(branches[i].right);
//            if (a==null) { a = new ArrayList<>(); }
//            a.add(i);
//            bMap.put(branches[i].right, a);
        }

        // 全探索
        search(allNode, allEdge, allNode[0], null, null);
//        dumpAll(allNode[0]);

        for(int i=0;i<Q;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();
//            System.out.println(x + ", " + y + ", " + u + ", " + v);

            Node node = allNode[0];
 //           int result2 = calc2(node, x, y, u, v);
            System.out.println(0);

//            int result = 0;
//            Branch br;
//            for ( int index : bMap.get(u)) {
//                br = branches[index];
////                System.out.println(index);
////            for (Branch br:branches) {
//                if ((br.left == u) || (br.right == u)) {
//                    result = calc(bMap, branches, br, x, y, u, v);
//                }
//                if (result != -1) {
//                    break;
//                }
//            }
//            System.out.println(result);
//            System.out.println();
        }
//        System.out.println();
    }

    private static void dumpAll(Node node) {
        Node.dump(node);

        for(Node n:node.child) {
            dumpAll(n);
        }

    }

    private static int calc2 (Node node, int x, int y, int u, int v) {
        int result = 0;
        int counter = 0;

        for(Node n:node.child) {
            if ((n.id == u) || (n.id == v)) {
                if ( n.parentEdge.color == x ) {
                    result += y;
                } else {
                    result += n.parentEdge.distance;
                }
                counter ++;
            }
            if ((n.allChildNodes.contains(u)) || (n.allChildNodes.contains(v))) {
                result += calc2(n, x, y, u, v);
                counter ++;
            }
        }

        if (node.parentEdge != null && counter == 1) {
            if ( node.parentEdge.color == x ) {
                result += y;
            } else {
                result += node.parentEdge.distance;
            }
        }

        return result;
    }

    private static List<Integer> search(Node[] allNode, Edge[] allEdge, Node node, Node parent, Edge parentEdge) {
        node.parentNode = parent;
        node.child.remove(parent);

        if (parent != null) {
            for (Edge e : node.childEdge) {
                if ((e.left == parent.id) || (e.right == parent.id)) {
                    node.parentEdge = e;
                    break;
                }
            }
            node.childEdge.remove(node.parentEdge);
        }

        List<Integer> result = new ArrayList<>();
        for(Node n:node.child) {
             result = Stream.concat(result.stream(), search(allNode, allEdge, n, node, null).stream()).collect(Collectors.toList());
        }
        node.allChildNodes = new ArrayList<>(result);
        result.add(node.id);

        return result;
    }

    private static int calc(Map<Integer, List<Integer>> map, Branch[] branches, Branch b, int color, int distance, int source, int destination) {
        int result = -1;
        int d;
        if ((b.left == 0) || (b.right == 0)) {
//            Branch.dump(b);
//            System.out.println("==");
            return -1;
        }

        if (b.color == color) {
            d = distance;
        } else {
            d = b.distance;
        }

        if ((b.right == destination) || (b.left == destination)) {
            result = d;
//            Branch.dump(b);
//            System.out.println("<>");
        } else if (b.right == source) {
//            Branch.dump(b);
//            System.out.println(" >");

            Branch br;
            for ( int index : map.get(b.left)) {
                br = branches[index];
//            for (Branch br:branches) {
//                Branch.dump(b);
//                Branch.dump(br);
//                if (!br.equals(b) && ((br.left == b.left) || (br.right == b.left))) {
                if (!br.equals(b)) {
                    result = calc(map, branches, br, color, distance, b.left, destination);
                }
                if (result != 0) {
                    break;
                }
            }

            if (result != -1) {
                result += d;
            }
        } else if(b.left == source) {
//            Branch.dump(b);
//            System.out.println("< ");

            Branch br;
            for ( int index : map.get(b.right)) {
                br = branches[index];
//            for (Branch br : branches) {
//                if (!br.equals(b) && ((br.left == b.right) || (br.right == b.right))) {
                if (!br.equals(b)) {
                    result = calc(map, branches, br, color, distance, b.right, destination);
                }
                if (result != -1) {
                    break;
                }
            }

            if (result != -1) {
                result += d;
            }
        }
        return result;
    }

    private static class Branch {
        int left;
        int right;
        int color;
        int distance;
        int tmp_distance;

        static void dump(Branch b) {
            System.out.println("(" + b.left + ", " + b.right + ", " + b.color + ", " + b.tmp_distance + ")");
        }

    }

    private static class Node {
        int id;
        Node parentNode;
        Edge parentEdge;
        List<Node> child = new ArrayList<>();
        List<Edge> childEdge = new ArrayList<>();
        List<Integer> allChildNodes = new ArrayList<>();

        static void dump(Node node) {
            if (node.parentNode != null) {
                if (node.parentEdge != null) {
                    System.out.print("(" + node.parentNode.id + " ->(" + node.parentEdge.color + ":" + node.parentEdge.distance + ") " + node.id + " -> [");
                } else {
                    System.out.print("(" + node.parentNode.id + " -> " + node.id + " -> [" );

                }
            } else {
                System.out.print("(     " + node.id + " -> [");
            }
            for(Node n:node.child) {
                System.out.print(" " + n.id);
            }
            System.out.print("] :");
            for(Integer i:node.allChildNodes) {
                System.out.print(" " + i);
            }
            System.out.println(")");
        }
    }

    private static class Edge {
        int color;
        int distance;
        int left;
        int right;

    }
}