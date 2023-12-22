import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] t = new int[N];
        int ans = 0;
        int a = 0;

        for(int i=0; i<N; i++){
            t[i] = sc.nextInt();
            if(t[i]<=ans){
                ans = t[i] + T - a;
            }
            else{
                ans += T;
                a = t[i] - ans;
            }
        }
        System.out.println(ans);
    }
}