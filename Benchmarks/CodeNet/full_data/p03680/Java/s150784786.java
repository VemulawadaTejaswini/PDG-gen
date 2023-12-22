import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - 1;
        }
        boolean[] visited = new boolean[n];
        int count = 0;
        int cur = 0;
        visited[cur] = true;
        while (true) {
            ++count;
            int next = a[cur];
            if (visited[next]) {
                System.out.println(-1);
                return;
            }
            if (next == 1) {
                System.out.println(count);
                return;
            }

            visited[next] = true;
            cur = next;
        }
    }
}