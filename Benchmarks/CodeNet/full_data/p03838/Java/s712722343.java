import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();
        if(y==0)x*=-1;
        if(x==y){
            System.out.println("0");
            return;
        }
        long ans=Math.abs(Math.abs(y)-Math.abs(x));
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

