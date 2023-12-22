import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        String s = sc.next();
        if(a>=3200){
            System.out.println(s);
        }else{
            System.out.println("red");
        }
    }
}