import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = Long.parseLong(sc.next());
        long r = Long.parseLong(sc.next());
        long minMod = 2019;
        loop1:
        for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                long tmpMod = (i * j) % 2019;
                if (tmpMod < minMod) {
                    minMod = tmpMod;
                }
                if (minMod == 0) {
                    break loop1;
                }
            }
        }
        System.out.println(minMod);
    }
}