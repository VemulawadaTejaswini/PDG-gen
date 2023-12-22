import java.util.Scanner;
import java.util.HashSet;

class Main {
    int n;
    String s;

    Main() {
        Scanner sc = new Scanner(System.in);
        this.n = Integer.parseInt(sc.next());
        this.s = sc.next();
    }

    int cutAndCount(int i) {
        int charsContainedInBoth = 0;

        String x, y;
        x = s.substring(0, i); y = s.substring(i);
        
        HashSet<Character> charSet = new HashSet<>();
        String shorter = x.length() < y.length() ? x : y;
        String longer = x.length() >= y.length() ? x : y;
        for (char c : shorter.toCharArray()) {
            charSet.add(c);
        }

        for (char cShorter : charSet) {
            for (char cLonger : longer.toCharArray()) {
                if (cShorter == cLonger) {
                    charsContainedInBoth++;
                    break;
                }
            }
        }

        return charsContainedInBoth;
    }

    void solve() {
       int max = 0;

       // test all patterns
       for (int i = 1; i < n; ++i) {
           max = Math.max(cutAndCount(i), max);
       } 

       System.out.println(max);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.solve();
    }
}