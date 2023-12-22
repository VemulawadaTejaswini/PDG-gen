import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i=0;i<N;i++) {
            int A = Integer.parseInt(sc.next());
            if (A==(i+1)) {
                ans++;
                i++;
            }
        }
        System.out.println(ans);
    }
}