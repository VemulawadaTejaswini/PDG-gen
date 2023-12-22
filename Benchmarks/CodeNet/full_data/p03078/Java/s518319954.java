import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();
            int K = in.nextInt();
            long[] A = new long[X];
            long[] B = new long[Y];
            long[] C = new long[Z];
            for (int i = 0; i < X; i++) {
                A[i] = in.nextLong();
            }
            for (int i = 0; i < Y; i++) {
                B[i] = in.nextLong();
            }
            for (int i = 0; i < Z; i++) {
                C[i] = in.nextLong();
            }

            ArrayList<Node> list = new ArrayList<>();
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    Node e = new Node();
                    e.sum = A[i] + B[j];
                    list.add(e);
                }
            }
            Collections.sort(list);

            ArrayList<Node> list2 = new ArrayList<>();
            int size = Math.min(K, list.size());
            for (int i = 0; i < size; i++) {
                Node node = list.get(i);
                for (int j = 0; j < Z; j++) {
                    Node e = new Node();
                    e.sum = node.sum + C[j];
                    list2.add(e);
                }
            }
            Collections.sort(list2);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < K; i++) {
                sb.append(list2.get(i).sum + "\n");
            }
            System.out.println(sb.toString());
            System.out.flush();

        }
    }
}

class Node implements Comparable<Node> {
    long sum;

    @Override
    public int compareTo(Node o) {
        if (sum > o.sum) {
            return -1;
        }
        if (sum < o.sum) {
            return 1;
        }
        return 0;
    }
}