import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] ns = new int[n];
        for(int i = 0; i < n; i++){
            ns[i] = sc.nextInt();
        }
        boolean done = false;
        while(!done) {
            for (int i = 0; i < ns.length ; i++) {
                if (ns[i] % 2 == 1) done = true;
                else ns[i] /= 2;
            }
            if(!done) max++;
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        solve();
    }
}
