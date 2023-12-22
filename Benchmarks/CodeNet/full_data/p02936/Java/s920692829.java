import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        Node nodes[] = new Node[n];
        for (int i=0; i<n; i++) nodes[i] = new Node();
        for (int i=0; i<n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            nodes[a].neighbors.add(nodes[b]);
            nodes[b].neighbors.add(nodes[a]);
        }

        for (int i=0; i<q; i++){
            int p = sc.nextInt()-1;
            nodes[p].offset += sc.nextInt();
        }

        dfs(null, nodes[0], 0);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++){
            sb.append(nodes[i].counter).append(" ");
        }
        System.out.println(sb.toString());


    }

    private static void dfs(Node parent, Node node, int sum){
        sum += node.offset;
        node.counter = sum;
        for (Node n: node.neighbors){
            if (n != parent){
                dfs(node, n, sum);
            }
        }
    }


    private static class Node{
        private List<Node> neighbors = new ArrayList<>();
        private int offset;
        private int counter;
    }
}