import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        final int K = sc.nextInt();
        sc.close();

        int cnt = 1;
        while (N >= K) {
            N /= K;
            cnt++;
        }

        System.out.println(cnt);
    }
}