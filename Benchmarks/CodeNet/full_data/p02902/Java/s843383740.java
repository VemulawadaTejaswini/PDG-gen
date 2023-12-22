import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static List<List<Integer>> t;
    static boolean[] visited;
    static boolean[] grey;
    static int[] prev;
    static List<Integer> shortestCycle;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        t = new ArrayList<List<Integer>>(N);
        for(int i = 0; i <= N; i++) {
            t.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            t.get(a).add(b);
        }
        visited = new boolean[N+1];
        grey = new boolean[N+1];
        prev = new int[N+1];

        boolean isSuccessful = false;
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
            }
        }
        if(shortestCycle != null) {
            System.out.println(shortestCycle.size());
            for(int l: shortestCycle) {
                System.out.println(l);
            }
        } else {
            System.out.println("-1");
        }
    }

    static void dfs(int s) {
        grey[s] = true;
        for(int i : t.get(s)) {
            if(!visited[i]) {
                if(grey[i]) {
                    List<Integer> lst = new ArrayList<>();
                    int tmp = s;
                    while(tmp != i) {
                        lst.add(tmp);
                        tmp = prev[tmp];
                    }
                    lst.add(i);
                    if(shortestCycle == null || lst.size() < shortestCycle.size()) {
                        shortestCycle = lst;
                    }
                } else {
                    prev[i] = s;
                    dfs(i);
                }
            }
        }
        visited[s] = true;
    }
}