import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Integer, ArrayList<Integer>> map;
    static int[] color;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        map = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 1; i <= N; i++) map.put(i, new ArrayList<Integer>());
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        color = new int[N+1];
        long ans = 0;
        if (dfs(0, 1, 1)) {
            long white = 0;
            for (int i = 1; i < N; i++) {
                if (color[i] == 1) white++;
            }
            ans = white * (N - white) - M;
        } else{
           ans = (long) N * (N - 1) / 2 - M;
        }
        System.out.println(ans);
        sc.close();

    }

    private static boolean dfs(int pre, int cur, int c) {
        if(color[cur] == 0){
            color[cur] = c;
        }else if(color[cur] != c){
            return false;
        }
        boolean ret = true;
        for(int i = 0; i < map.get(cur).size(); i++){
            int x = map.get(cur).get(i);
            if(x == pre) continue;
            ret &= dfs(cur, x, -c);
        }

        return ret;
    }

}
