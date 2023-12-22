import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int ai = s.nextInt();
            sum += ai;
        }
        System.out.println(sum >= h ? "Yes" : "No");
    }
}
