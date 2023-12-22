import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int order = Integer.parseInt(sc.next());
        int mul = 1;
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                mul *= 100;
            }
        }
        int ans = 0;
        for (int i = 0; i < order; i++) {
            ans += mul;
        }
        System.out.println(ans);
    }
}