import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int D = in.nextInt();
            int G = in.nextInt();
            int[] p = new int[D];
            int[] c = new int[D];
            for (int i = 0; i < D; i++) {
                p[i] = in.nextInt();
                c[i] = in.nextInt();
            }

            class Node {
                int[] counts;
                int point;
                int numProblems;

                public Node(int[] counts, int point, int numProblems) {
                    super();
                    this.counts = counts;
                    this.point = point;
                    this.numProblems = numProblems;
                }
            }

            int min = (int) 1e9;
            PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    if (o1.numProblems < o2.numProblems) {
                        return -1;
                    }
                    if (o1.numProblems > o2.numProblems) {
                        return 1;
                    }

                    if (o1.point > o2.point) {
                        return -1;
                    }
                    if (o1.point < o2.point) {
                        return 1;
                    }

                    return 0;
                }
            });
            HashSet<String> used = new HashSet<String>();
            {
                pq.add(new Node(new int[D], 0, 0));
            }
            for (; !pq.isEmpty();) {
                Node node = pq.poll();

                if (node.point >= G) {
                    min = Math.min(min, node.numProblems);
                    continue;
                }
                if (node.numProblems >= min) {
                    continue;
                }

                int[] copy = Arrays.copyOf(node.counts, D);
                for (int i = 0; i < D; i++) {
                    if (copy[i] >= p[i]) {
                        continue;
                    }
                    copy[i]++;
                    if (used.add(hash(copy))) {
                        int[] next = Arrays.copyOf(copy, D);
                        int nextPoints = (i + 1) * 100 + node.point;
                        if (next[i] >= p[i]) {
                            nextPoints += c[i];
                        }
                        pq.add(new Node(next, nextPoints, 1 + node.numProblems));
                    }
                    copy[i]--;
                }
            }

            System.out.println(min);
        }
    }

    private static String hash(int[] a) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(a[i]).append(",");
        }
        return res.toString();
    }
}
