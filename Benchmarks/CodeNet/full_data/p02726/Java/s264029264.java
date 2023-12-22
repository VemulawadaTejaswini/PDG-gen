

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * BFSを用いた実装
 *
 * @author kou
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());

        scan.close();

        x--;
        y--;
        int[] k = new int[n];

        for (int startNode = 0; startNode < n; startNode++) {
            int[] distanceArray = new int[n];
            for (int i = 0; i < n; i++) {
                distanceArray[i] = Integer.MAX_VALUE;
            }
            Deque<Integer> queue = new ArrayDeque<Integer>();

            addNode(distanceArray, queue, startNode, 0);
            while (queue.size() != 0) {
                int node = queue.poll();
                if (node + 1 < n) {
                    addNode(distanceArray, queue, node + 1, distanceArray[node] + 1);
                }
                if (node - 1 >= 0) {
                    addNode(distanceArray, queue, node - 1, distanceArray[node] + 1);
                }
                if (node == x) {
                    addNode(distanceArray, queue, y, distanceArray[node] + 1);
                }
                if (node == y) {
                    addNode(distanceArray, queue, x, distanceArray[node] + 1);
                }
            }

            for (int i = 0; i < n; i++) {
                k[distanceArray[i]]++;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(k[i] / 2);
        }
    }

    private static void addNode(int[] distanceArray, Deque<Integer> queue, int node, int dist) {
        if (distanceArray[node] != Integer.MAX_VALUE) {
            return;
        }
        distanceArray[node] = dist;
        queue.add(node);
    }

}
