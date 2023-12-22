import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        int n = in.nextInt();
        int[] a = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        long ans1 = 0, ans2 = 0, sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(i%2 == 1 && sum <= 0){
                ans1 += Math.abs(sum) + 1;
                sum = 1;
            }
            if(i%2 == 0 & sum >= 0){
                ans1 += Math.abs(sum) + 1;
                sum = -1;
            }
        }
        sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(i%2 == 0 && sum <= 0){
                ans2 += Math.abs(sum) + 1;
                sum = 1;
            }
            if(i%2 == 1 & sum >= 0){
                ans2 += Math.abs(sum) + 1;
                sum = -1;
            }
        }

        System.out.println(Math.min(ans1, ans2));
    }

    public static void main(String[] args){
       new Main().solve();    
    }
}