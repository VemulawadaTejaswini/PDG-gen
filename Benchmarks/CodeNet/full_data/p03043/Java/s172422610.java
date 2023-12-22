//https://atcoder.jp/contests/abc126/tasks/abc126_c

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double K = sc.nextDouble();
        double ans = 0;
        for (int i=1;i<=N;i++){
            int point = i;
            int cnt = 0;
            while (point<K){
                point *= 2;
                cnt++;
            }
            ans += 1/N*Math.pow(0.5,cnt);
        }
        System.out.println(ans);
    }
}