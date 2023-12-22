import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] c = new int[N];
        int[] t = new int[N];
        
        int min = 0;
        
        for (int i = 0; i < N; ++i){
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if (t[i] <= T){
                if (min > c[i] || min == 0){
                    min = c[i];
                }
            }
        }
        
        if (min == 0){  //すべてTより大きかった場合
             System.out.println("TLE");
        } else {
            System.out.println(min);
        }

    }
}