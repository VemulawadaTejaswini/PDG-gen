import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int K = sc.nextInt();
        int[] l = new int[N+1];
        int a = N+1;
        boolean f = false;
        for(int i = 1;i <= N;i++){
            l[i] = sc.nextInt();
            if(l[i] >= 0 && !f){
                a = i;
                f = true;
            }
        }
        int mi = 0;
        int Mi = 0;
        if(a-1 >= K){
            Mi = a-1;
            mi = a-K;
        }else{
            mi = 1;
            Mi = K;
        }
        long ans = Long.MAX_VALUE;
        while(mi <= a && Mi <= N){
            if(Mi < a){
                ans = Math.min(ans, -l[mi]);
            }else if(mi == a){
                ans = Math.min(ans, l[Mi]);
            }else{
                long c = Math.min(l[Mi], -l[mi]);
                long cc = Math.max(l[Mi], -l[mi]);
                ans = Math.min(ans, c*2+cc);
            }
            mi++;
            Mi++;
        }
        System.out.println(ans);
    }
}