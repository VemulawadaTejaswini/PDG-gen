import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        char[] S = sc.next().toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char c : S) {
            if (set.contains(c)) {
                System.out.println("no");
                return;
            }
            else {
                set.add(c);
            }
        }
        System.out.println("yes");
    }
}