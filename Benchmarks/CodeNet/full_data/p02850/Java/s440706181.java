import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int[] adj = new int[n];
        int[] res = new int[n-1];
        int k = 0;
        for (int i = 0; i < n-1; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            adj[ai-1]++;
            adj[bi-1]++;
            res[i] = Math.max(adj[ai-1], adj[bi-1]);
            k = Math.max(res[i], k);
        }
        System.out.println(k);
        for (int i = 0; i < n-1; i++) {
            System.out.println(res[i]);
        }
    }
}
