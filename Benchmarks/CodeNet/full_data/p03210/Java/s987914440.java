import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long MOD = 1000000007;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X==3||X==5||X==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
