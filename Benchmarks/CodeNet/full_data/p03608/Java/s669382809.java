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
            nodes[i] = new Node();
        }
        initNodes();

        int[] mustPasses = new int[R];
        minCosts = new int[R][R];
        for (int i = 0; i < R; i++) {
            mustPasses[i] = scanner.nextInt() - 1;
        }
        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            nodes[A - 1].nexts.add(B - 1);
            nodes[A - 1].costs.add(C);
            nodes[B - 1].nexts.add(A - 1);
            nodes[B - 1].costs.add(C);
        }
        for (int i = 0; i < R - 1; i++) {
            for (int j = i + 1; j < R; j++) {
                int cost = minCost(mustPasses[i], mustPasses[j]);
                minCosts[i][j] = cost;
                minCosts[j][i] = cost;
            }
        }
        ArrayList<Integer> rest = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            rest.add(i);
        }
        for (int i = 0; i < R; i++) {
            ArrayList<Integer> cpy = (ArrayList<Integer>) rest.clone();
            cpy.remove(new Integer(i));
            searchMin(cpy, 1, 0, i);
        }
        System.out.println(ans);
    }

    void searchMin(ArrayList<Integer> rest, int floor, int currentCost, int prev) {
        if (floor == R) {
            ans = ans < currentCost ? ans : currentCost;
            return;
        }
        for (int passing : rest) {
            ArrayList<Integer> cpy = (ArrayList<Integer>) rest.clone();
            cpy.remove(new Integer(passing));
            searchMin(cpy, floor + 1, currentCost + minCosts[prev][passing], passing);
        }
    }

    int minCost(int start, int end) {
        Queue<Node> nonFixes = new PriorityQueue<>((o1, o2) -> o1.tmpCost - o2.tmpCost);
        Node currentNode = nodes[start];
        currentNode.tmpCost = 0;
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
