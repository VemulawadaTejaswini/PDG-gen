import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cake = 4;
        int donuts = 7;
        boolean ans = false;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int total = (i * cake) + (j * donuts);
                if (total == n) {
                    ans = true;
                    break;
                }
            }
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
