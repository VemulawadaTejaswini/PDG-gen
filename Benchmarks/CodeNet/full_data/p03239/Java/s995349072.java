import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T=sc.nextInt();
        int[] c=new int[N];
        int[] t=new int[N];
        for(int i=0;i<N;i++){
            c[i]=sc.nextInt();
            t[i]=sc.nextInt();
        }
        long ans=INF;
        for(int i=0;i<N;i++){
            if(t[i]<=T){
                ans=Math.min(ans,c[i]);
            }
        }
        if(ans==INF){
            System.out.println("TLE");
            return;
        }
        System.out.println(ans);
    }
}