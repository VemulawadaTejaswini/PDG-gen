import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }


    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = cin.nextInt();
            B[i] = cin.nextInt();
        }
        boolean[] used = new boolean[N];
        if(dfs(0, N, A, B, used, 0)) System.out.println("Yes");
        else System.out.println("No");
    }

    //depth:こなした仕事数 used:使用状況　time:現在までにかかった時間 の時、全て間に合う方法があるならtrue
    boolean dfs(int depth, int N, int[] A, int[] B, boolean[] used, int time){
        if(depth == N) return true;
        for (int i = 0; i < N; i++){
            if(used[i]) continue;
            int nextTime = time + A[i];
            if(nextTime > B[i]) return false;
            used[i] = true;
            //次にiを使った時に間に合うパターンを見つけたらtrueを返す
            if(dfs(depth + 1, N, A, B, used, nextTime)) return true;
            used[i] = false;
        }
        return  false;
    }
}
