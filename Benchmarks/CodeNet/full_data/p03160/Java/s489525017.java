import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] h = new int[N+2];
        for(int i=1;i<=N;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        int[] ans = new int[N+2];
        for(int i=2;i<=N;i++){
            if(i>1)
                ans[i] = Math.min(ans[i-2]+Math.abs(h[i-2]-h[i]), ans[i-1] + Math.abs(h[i-1]-h[i]));
            else
                ans[i] = ans[i-1] + Math.abs(h[i-1]-h[i]);
        }
        System.out.println(ans[N]);
    }
}