import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            a[i]--;
        }

        int cnt = 0;
        int i = 0;
        while (!visited[i]) {
            // marking i as a visited place.
            visited[i] = true;

            // traversing dependency.
            i = a[i];
            cnt++;
            if (i == 1) {
                System.out.println(cnt);
                return;
            }
        }

        System.out.println(-1);
        return;
    }

}