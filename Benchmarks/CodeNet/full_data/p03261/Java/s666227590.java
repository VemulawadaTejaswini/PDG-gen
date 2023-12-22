import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N = scan.nextInt();
        String[] W = new String[N];
        String ans = "Yes";
        
        for (int i = 0; i < N; i++) {
            W[i] = scan.next();
        }
        for (int i = 0; i < N - 1; i++) {
            if (W[i].charAt(W[i].length() - 1) != W[i + 1].charAt(0)) {
                ans = "No";
                break;
            }
            if (!check(W, W[i])) {
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);
    }
    
    public static boolean check(String[] W, String s) {
        int count = 0;
        boolean r = true;
        
        for (int i = 0; i < W.length; i++) {
            if (W[i].equals(s)) {
                count++;
            }
            if (count == 2) {
                r = false;
                break;
            }
        }
        
        return r;
    }
}
