import java.util.*;
class Main {
    static int N,K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        System.out.println(dfs(1,0));

    }
    public static int dfs(int i, int depth) {
        if(depth == N) return i;
        return Math.min(dfs(i*2,depth+1), dfs(i+K, depth+1));
    }
}