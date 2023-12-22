import java.util.*;

public class Main {
    long data[][];

    public void main(Scanner sc) {
        int n = sc.nextInt();
        data = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            dijkstra(i, n);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Arrays.stream(data[i]).sum();
        }
        System.out.println(sum / 2);
    }

    private void dijkstra(int start, int n) {
        long mins[] = new long[n];
        boolean fix[] = new boolean[n];

        Arrays.fill(mins, 1145141919);
        mins[start] = 0;

        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> Long.compare(mins[o1], mins[o2]));
        queue.add(start);
        while (!queue.isEmpty()) {
            int src = queue.poll();
            fix[src] = true;

            for (int dst = 0; dst < n; dst++) {
                if (!fix[dst] && data[src][dst] != 0) {
                    long srcCost = mins[src];
                    long dstCost = mins[dst];
                    long eCost = data[src][dst];

                    if (dstCost > srcCost + eCost) {
                        mins[dst] = srcCost + eCost;
                        queue.add(dst);
                    } else if (dstCost == srcCost + eCost) {
                        data[start][dst] = 0;
                        data[dst][start] = 0;
                        queue.add(dst);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (data[start][i] != 0 && data[start][i] != mins[i]) {
                System.out.println(-1);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
