import java.util.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[M];
        for (int i = 0; i < M; i++) A[i] = sc.nextInt();

        solver(N, M, A);
    }

    public static void solver(int N, int M, int[] A) {
        int[] need_matchstick = {-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        // 必要なマッチ数が小さい順番にソートして管理
        Map<Integer, Integer> matchnum_number = new HashMap<Integer, Integer>();
        for (int m = 0; m < M; m++) {
            int num = A[m];
            matchnum_number.put(need_matchstick[num], num);
        }

        // ちょうどi本のマッチ棒を利用するときの整数の最大値を動的計画法で計算
        String[] dp = new String[N+1];

        // 初期化
        for(Map.Entry<Integer, Integer> entry : matchnum_number.entrySet()){
            String num = String.valueOf(entry.getValue());
            int match = entry.getKey();

            if(dp[match] == null || dp[match].compareTo(num) < 0) {
                dp[match] = num;
            }
        }

        for(int n = 2; n <= N; n++){
            String maxNumStr = dp[n];

            for(Map.Entry<Integer, Integer> entry : matchnum_number.entrySet()){
                int match = entry.getKey();
                String num = String.valueOf(entry.getValue());

                if(n - match >= 0 && dp[n - match] != null) {
                    String numStr = dp[n - match] + String.valueOf(num);
                    if(maxNumStr == null){
                        maxNumStr = numStr;
                    }

                    if(maxNumStr != null){
                            if(maxNumStr.length() < numStr.length()){
                                maxNumStr = numStr;
                            }
                            else if(maxNumStr.length() <= numStr.length() && maxNumStr.compareTo(numStr) < 0) {    //numStrの方が大きい時
                                maxNumStr = numStr;
                            }

                    }
                    //out.println(n+":"+dp[n-match]+","+entry.getKey()+","+entry.getValue()+"->"+numStr+"->"+maxNumStr);
                }
            }

            dp[n] = maxNumStr;
            //out.println("=>"+dp[n]);
        }


        //for(int m = 0; m < 10; m++){
        //    out.println(dp[m]);
        //}
        out.println(dp[N]);
    }
}