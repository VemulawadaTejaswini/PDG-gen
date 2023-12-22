import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] Healths = new int[n];
        for(int i = 0; i < n; i++) {
            Healths[i] = in.nextInt();
        }
        Arrays.sort(Healths);
        long ans = 0;
        for(int i = 0; i < n - k; i++) {
            ans += Healths[i];
        }
        System.out.println(ans);
    }
}
