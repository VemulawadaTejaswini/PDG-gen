import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //都市の数
        int M = sc.nextInt();   //道路の本数
        int[] count = new int[N];   //各都市の道路の数を数える配列

        for (int i = 0; i < M * 2; ++i){
            count[sc.nextInt() - 1] += 1;
        }
        for (int i = 0; i < N; ++i){
            //出力
            System.out.println(count[i]);   //各都市から出ている道路の本数を表示
        }
        
    }
}