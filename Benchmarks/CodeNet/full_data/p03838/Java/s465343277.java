import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=0;
        if(x<0){
            ans++;
        }
        if(y<0){
            ans++;
        }
        ans+=Math.abs(Math.abs(x)-Math.abs(y));
        System.out.println(ans);
    }
}