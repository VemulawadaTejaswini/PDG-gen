import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int n = Integer.parseInt(sc.next() + sc.next() + sc.next());
        if (n % 4 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}