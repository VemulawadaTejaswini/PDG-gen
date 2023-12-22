import java.util.*;

public class B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long h = sc.nextLong();
        int n = sc.nextInt();
        long s = 0;
        for(int i = 0; i < n; ++i) {
            s += sc.nextLong();
        }
        String ans = (s >= h) ? "Yes" : "No";
        System.out.println(ans);
    }
}