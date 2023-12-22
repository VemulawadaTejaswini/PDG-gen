import java.util.*;
 
class Main {
    void solve(){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt() * 100, B = in.nextInt() * 100, C = in.nextInt(),
            D = in.nextInt(), E = in.nextInt(), F = in.nextInt();
        int wMax = (int)((double)F / (100 + E) * 100);
        int[] dp1 = new int[wMax + 1];
        for(int i = 0; i < dp1.length; i++){
            if(i - A >= 0) dp1[i] = Math.max(dp1[i], dp1[i - A] + A);
            if(i - B >= 0) dp1[i] = Math.max(dp1[i], dp1[i - B] + B);
        }
        int[] dp2 = new int[wMax + 1];
        for(int i = 0; i < dp2.length; i++){
            if(i - C >= 0 && dp1[i] != 0){
                int a = dp2[i - C] + C;
                if(100 * a <= E * dp1[i]){
                    dp2[i] = Math.max(dp2[i], dp2[i - C] + C);
                }
            }
            if(i - D >= 0 && dp1[i] != 0){
                int a = dp2[i - D] + D;
                if(100 * a <= E * dp1[i]){
                    dp2[i] = Math.max(dp2[i], dp2[i - D] + D);
                }
            }
        }
        int w = 0, s = 0;
        double max = 0;
        for(int i = 0; i < dp1.length; i++){
            double d = (100.0 * dp2[i]) / (dp1[i] + dp2[i]);
            if(d > max && dp1[i] + dp2[i] <= F){
                max = d;
                w = dp1[i];
                s = dp2[i];
            }
        }
        System.out.println(w+s + " " + s);
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}