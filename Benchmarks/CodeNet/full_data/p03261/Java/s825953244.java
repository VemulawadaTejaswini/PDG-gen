import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<String>();

        String prev = sc.next();
        set.add(prev);
        String curr = null;
        for (int i = 2; i <= N; i++) {
            curr = sc.next();

            if (set.contains(curr)) {
                System.out.println("No");
                return;
            }
            set.add(curr);

            int np = prev.length();
            if (prev.charAt(np - 1) != curr.charAt(0)) {
                System.out.println("No");
                return;
            }
            prev = curr;
        }

        System.out.println("Yes");

        return;
    }

}