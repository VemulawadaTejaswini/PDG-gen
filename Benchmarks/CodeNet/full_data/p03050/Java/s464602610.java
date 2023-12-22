import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long ans = 0;

        for(long n=1; n*n < N;n++){
            long candidate = N / n -1;
            //System.out.println(candidate);
            if(N / candidate == N % candidate){
                ans += candidate;
            }
        }

        System.out.println(ans);

    }
}
