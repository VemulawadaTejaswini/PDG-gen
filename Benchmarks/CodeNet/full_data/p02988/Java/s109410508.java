import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; ++i){
            p[i] = sc.nextInt();
        }
           
        int count = 0;   //カウント用の変数
        //条件を満たすものをカウント
        for (int i = 0; i < (n-2); ++i){ //要素数がn個の配列に対し、n-2回調べる
            if (p[i] < p[i+1] && p[i+1] < p[i+2] || p[i] > p[i+1] && p[i+1] > p[i+2]){
                ++count;
            }
        }
           
        //出力
        System.out.println(count);
        
    }
}
