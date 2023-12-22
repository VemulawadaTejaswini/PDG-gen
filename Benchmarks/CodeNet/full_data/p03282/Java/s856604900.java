import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        long cnt = 0;
        for(int i = 0; i<S.length(); i++) {
            int n = Character.getNumericValue(S.charAt(i));
            cnt = cnt + (long)Math.pow(n,5000);
            if(cnt >= K) {
                System.out.println(n);
                return;
            }
        }
    }
}