import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] t = new int[N];
        int ans = T;
        int a = 0;
        t[0] = sc.nextInt();

        for(int i=1; i<N; i++){
            t[i] = sc.nextInt();
            if(t[i]<=t[i-1]+T){
                ans = t[i] + T - a;
            }
            else{
                ans += T;
                a = a + t[i] - (t[i-1] + N) - 1;
            }
            System.out.println(ans + " "+a);
        }
        System.out.println(ans);
    }
}