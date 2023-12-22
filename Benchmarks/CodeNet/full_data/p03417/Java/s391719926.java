import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();
        long ans = 0;
        if(N == 1) {
            if(M == 1) {
                ans = 1;
            } else if(M == 2) {
                ans = 0;
            } else {
                ans = M - 2;
            }
        } else if(N == 2) {
            if(M == 1) {
                ans = 0;
            } else if(M == 2) {
                ans = 0;
            } else {
                ans = 0;
            }
        } else {
            if(M == 1) {
                ans = N - 2;
            } else if(M == 2) {
                ans = 0;
            } else {
                ans = (N - 2) * (M - 2);
            }
        }

        System.out.println(ans);
    }
}