import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long l = input.nextLong();
        long r = input.nextLong();
        long mid = Math.min(r, l + 2019);
        long ans = ((l % 2019) * ((l + 1) % 2019)) % 2019;
        for(long i = l; i <= mid; ++i){
            for(long j = i + 1; j <= mid; ++j){
                long x = ((l % 2019) * (j % 2019)) % 2019;
                ans = Math.min(ans, x);
            }
        }
        System.out.println(ans);
    }
}