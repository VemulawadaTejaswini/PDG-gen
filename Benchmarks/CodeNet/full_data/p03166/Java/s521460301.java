import java.util.*;

public class Main {
    static int N;
    static int M;
    static ArrayList<ArrayList<Integer>> edge;
    static int[] ans;

    static int path(int i) {
        if (ans[i]!=-1) return ans[i];
        int tmp = 0;
        for (Integer j : edge.get(i)) {
            tmp = Math.max(tmp, path(j)+1);
        }
        ans[i] = tmp;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());
        edge = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            edge.add(add);
        }
        for (int i=0;i<M;i++) {
            int x = Integer.parseInt(sc.next())-1;
            int y = Integer.parseInt(sc.next())-1;
            edge.get(x).add(y);
        }

        ans = new int[N];
        Arrays.fill(ans, -1);
        int max = 0;
        for (int i=0;i<N;i++) {
            max = Math.max(max, path(i));
        }
        System.out.println(max);
    }
}