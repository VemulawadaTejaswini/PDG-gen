import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());

        int minc = 1001;
        for (int i = 0 ; i < N ; i++) {
            int c = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            if (t <= T && c < minc) {
                minc = c;
            }
        }

        if (minc == 1001) {
            System.out.println("TLE");
            return;
        }
        
        System.out.println(minc);
    }

}
