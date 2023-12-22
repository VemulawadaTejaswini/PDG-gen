import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();

        long ans = 999999999;
        long Flag = (long) R/2019;
        Flag *= 2019;

        if(Flag == 0){
            ans = (L * (L + 1))%2019;
        }else if(L <= Flag){
            ans = 0;
        }else if(Flag < L){
            for (long i = L; i < R; i++) {
                for (long j = (L+1); j <= R; j++) {
                    long tmp = (i*j)%2019;
                    if(tmp < ans) ans = tmp;
                }
            }
        }

        System.out.println(ans);

    }
}
