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
        if(x==y){
            System.out.println("0");
            return;
        }
        int ans=Math.abs(y)-Math.abs(x);
        if((x<0&&y<0)||(x>0&&y>0)){
        if(x>y){
        ans+=2;
        }
        System.out.println(ans);
        return;
        
        }
        ans++;
        System.out.println(ans);
    }
}
