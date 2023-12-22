import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int swap[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(swap[i], 100);
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            swap[x - 1][y - 1] = 1;
            swap[y - 1][x - 1] = 1;
        }

        int data[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            data[i] = dijkstra(i, n, swap, 100);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if ((p[i] == i + 1) || (data[p[i] - 1][i] != 100)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public int[] dijkstra(int start, int n, int map[][], int inf) {
        int mins[] = new int[n];
        boolean fix[] = new boolean[n];
        Arrays.fill(mins, inf);
        mins[start] = 0;

        do {
            fix[start] = true;
            int minc = inf;
            int next = -1;
            for (int i = 0; i < n; i++) {
                if (!fix[i]) {
                    mins[i] = Math.min(mins[i], mins[start] + map[start][i]);
                    if (mins[i] <= minc) {
                        minc = mins[i];
                        next = i;
                    }
                }
            }

            start = next;
        } while (start != -1);

        return mins;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
