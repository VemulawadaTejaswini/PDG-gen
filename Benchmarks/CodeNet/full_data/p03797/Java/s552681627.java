import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        long cnt = 0;
        if(n <= m/2) {
            cnt = n;
            m -= n * 2;
            cnt += m / 4;
        } else {
            cnt = m / 2;
        }

        System.out.println(cnt);
    }


}