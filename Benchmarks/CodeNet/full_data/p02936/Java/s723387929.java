import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        final int Q = scan.nextInt();
        // 添字 ノード番号 tree[0][] 親ノード番号 tree[1][] カウンター
        int[][] tree = new int[2][N + 1];
        int a = 0;
        int b = 0;

        for(int i = 0; i < N - 1; i++){
            // 親ノード番号
            a = scan.nextInt();
            // ノード番号
            b = scan.nextInt();
            // 親ノード番号
            tree[0][b] = a;
        }
        // カウンターの初期化
        for(int i = 1; i <= N; i++){
            tree[1][i] = 0;
        }
        int p = 0;
        int x = 0;
        for(int i = 0; i < Q; i++){
            p = scan.nextInt();
            x = scan.nextInt();

            // 親ノード番号にpが登録されているノードのカウンターにxを加算
            addCounter(p, x, N, tree, true);
        }
        for(int i = 1; i <= N; i++){
            System.out.println(tree[1][i] + " ");
        }
        scan.close();

    }
    // 引数の親ノード番号が登録されているノードのカウンターにxを加算
    public static void addCounter(int p, int x, int N, int[][] tree, boolean firstFlg){
        if(firstFlg){
            tree[1][p] += x;
        }
        for(int i = 1; i <= N; i++){
            if(tree[0][i] == p){
                // カウンター加算
                tree[1][i] += x;
                addCounter(i,x,N,tree,false);
            }
        }
    }
}