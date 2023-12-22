import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(N==1) {
            System.out.println(M);
            return;
        }
        int ans = 1;
        for(int i = 2; i*i<=M; i++) {
            if(M%i != 0) continue;
            int b = M/i;
            if(i>N) ans = Math.max(ans, b);
            if(b>N) ans = Math.max(ans, i);
        }
        System.out.println(ans);
    }
}