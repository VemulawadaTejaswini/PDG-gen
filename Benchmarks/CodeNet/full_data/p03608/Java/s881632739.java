import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    int R;
    Scanner scanner = new Scanner(System.in);
    Node[] nodes;
    int[][] minCosts;
    
    int ans = 22902800;

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        R = scanner.nextInt();

        nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            nodes[0] = new Node();
        }
        initNodes();

        ArrayList<Integer> mustPasses = new ArrayList<>();
        minCosts = new int[R][R];
        for (int i = 0; i < R; i++) {
            mustPasses.add(scanner.nextInt());
        }
        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            nodes[A].nexts.add(B);
            nodes[A].costs.add(C);
            nodes[B].nexts.add(A);
            nodes[B].costs.add(C);
        }
        for (int i = 0; i < R - 1; i++) {
            for (int j = i + 1; j < R; j++) {
                int cost = minCost(i, j);
                minCosts[i][j] = cost;
                minCosts[j][i] = cost;
            }
        }
        for(int passing:mustPasses){
            ArrayList<Integer> cpy=(ArrayList<Integer>)mustPasses.clone();
            cpy.remove(new Integer(passing));
            searchMin(cpy,1,0,passing);
        }
        System.out.println(ans);
    }

    void searchMin(ArrayList<Integer> mustPasses, int floor, int currentCost,int prev) {
        if(floor==R-1){
            ans=ans<currentCost?ans:currentCost;
            return;
        }
        for(int passing:mustPasses){
            ArrayList<Integer> cpy=(ArrayList<Integer>)mustPasses.clone();
            cpy.remove(new Integer(passing));
            searchMin(cpy,floor+1,minCosts[prev][passing],passing);
        }
    }

    int minCost(int start, int end) {
        Queue<Node> nonFixes = new PriorityQueue<>((o1, o2) -> o1.tmpCost - o2.tmpCost);
        Node currentNode = nodes[start];
        while (currentNode != nodes[end]) {
            currentNode.tmpFixed = true;
            for (int i = 0; i < currentNode.nexts.size(); i++) {
                Node candidate = nodes[currentNode.nexts.get(i)];
                if (candidate.tmpFixed) {
                    continue;
                }
                int newCost = currentNode.tmpCost + currentNode.costs.get(i);
                candidate.tmpCost = candidate.tmpCost < newCost ? candidate.tmpCost : newCost;
                if (!nonFixes.contains(candidate)) {
                    nonFixes.add(candidate);
                }
            }
            currentNode = nonFixes.poll();
        }
        int cost = currentNode.tmpCost;
        initNodes();
        return cost;
    }

    void initNodes() {
        Arrays.stream(nodes).forEach(o -> o.tmpCost = 114514);
        Arrays.stream(nodes).forEach(o -> o.tmpFixed = false);
    }

    class Node {

        List<Integer> nexts = new ArrayList<Integer>();
        List<Integer> costs = new ArrayList<Integer>();
        int tmpCost;
        boolean tmpFixed;
    }
}
