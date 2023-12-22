import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);
 
        // ロード
        String[] NM = sc.nextLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[][] transitionMat = new int[N][N];
        String[] trans_str;
        int from, to;
        for (int i = 0; i < M; i++) {
            trans_str = sc.nextLine().split(" ");
            from = Integer.parseInt(trans_str[0]);
            to = Integer.parseInt(trans_str[1]);
            transitionMat[from - 1][to - 1] = 1;
        }
 
        // 処理
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += transitionMat[0][i] * transitionMat[i][N - 1];
        }
 
        // 出力
        if (result > 0) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
 
        // scanner
        sc.close();
    }
}