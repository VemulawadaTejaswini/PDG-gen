import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);
    public void solve() {
        int n = in.nextInt(), k = in.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++) {
        		l[i] = in.nextInt();
        }
        Arrays.sort(l);
        int sum = 0;
        for(int i = l.length - 1; i > l.length - 1 - k; i--) {
        		sum += l[i];
        }
        System.out.println(sum);
   

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}