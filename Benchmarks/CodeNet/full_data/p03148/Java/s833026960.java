import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] s = new int[N][2];
        for(int i = 0; i < N; i++){
            s[i][0] = sc.nextInt();
            s[i][1] = sc.nextInt();
        }
        Arrays.sort(s ,(x, y) -> y[1] - x[1]);
        int[] count = new int[N+1];
        long ans = 0;
        long sum = 0;
        long kind = 0;
        // 美味しさが大きいほうからK個選択したときの得点を計算
        for(int i = 0; i < K; i++){
            sum += s[i][1];
            count[s[i][0]]++;
            if(count[s[i][0]] ==1){
                kind++;
            }
        }
        ans = sum + kind * kind;
        // 既に選択済みのスシの中から次に入れ替える候補の添え字
        int idx = K-1;
        // まだ選ばれていないスシのうち、種類数が減らないように未選択の種類のスシを入れ替えていく
        for(int i = K; i < N; i++){
            // 既に選択済みのスシは入れ替えてもマイナスなので入れ替えない
            if(count[s[i][0]] >0) continue;
            while (idx >= 0) {
                // 選択済みのうち交換すると種類が減ってしまうスシの場合は交換しない
                if (count[s[idx][0]] == 1) {
                    idx--;
                    continue;
                }
                count[s[i][0]] = 1;
                count[s[idx][0]]--;
                kind++;
                sum = sum + s[i][1] - s[idx][1];
                ans = Math.max(ans, sum + kind * kind);
                idx--;
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
