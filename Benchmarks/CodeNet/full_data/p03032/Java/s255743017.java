//https://atcoder.jp/contests/abc128/tasks/abc128_d

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
    static int N,K;
    static int[] V;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        V = new int[N];
        for (int i=0;i<N;i++){
            V[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=0;i<=K;i++){
            for (int j=0;j<=K;j++){
                int score = 0;
                ArrayList<Integer> owned = new ArrayList<>();
                if (i+j>Math.min(N,K)){
                    break;
                }
                for (int k=0;k<i;k++){
                    score += V[k];
                    owned.add(V[k]);
                }
                for (int k=0;k<j;k++){
                    score += V[N-k-1];
                    owned.add(V[N-k-1]);
                }
                int drop = Math.min(N,K)-(i+j);
                if (drop<=0){
                    break;
                }
                Collections.sort(owned);
                for (int k=0;k<Math.min(drop,owned.size());k++){
                    if (owned.get(k)<0){
                        score -= owned.get(k);
                    }
                }
                ans = Math.max(ans,score);
            }
        }
        System.out.println(ans);
    }
}