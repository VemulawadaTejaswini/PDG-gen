import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        sc.close();

        long fivehCnt = 0;
        long fiveCnt = 0;

        fivehCnt = S / 500;

        long amari = S % 500;

        fiveCnt = amari / 5;

        System.out.println(1000 * fivehCnt + 5 * fiveCnt);
    }
}
