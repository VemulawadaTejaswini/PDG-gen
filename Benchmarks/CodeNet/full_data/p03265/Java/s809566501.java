import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int y=y2-y1;
        int x=x2-x1;
        System.out.println((x2-x)+" "+(y2+y)+" "+ (x1-x) +" "+ (y1+y));
    }
}