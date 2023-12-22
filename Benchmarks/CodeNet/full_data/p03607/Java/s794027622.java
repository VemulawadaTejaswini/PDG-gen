import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        List<String> l = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String tmp = sc.next();
            if (l.contains(tmp)) {
                l.remove(tmp);
            }else{
                l.add(tmp);
            }
        }
        
        System.out.println(l.size());
    }
}
