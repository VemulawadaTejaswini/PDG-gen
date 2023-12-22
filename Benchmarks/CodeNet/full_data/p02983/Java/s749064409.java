import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long L = Long.parseLong(sc.next());
        final long R = Long.parseLong(sc.next());
        sc.close();

        int min = Integer.MAX_VALUE;

        for (long i=L; i<R; i++) {
            for (long j=i+1; j<=R; j++) {
                long mod = (i * j) % 2019;
                if (min>mod)
                    min = (int)mod;
                if (i%2019==0 || j%2019==0) {
                    System.out.println(0);
                    return;
                }
            }
        }

        System.out.println(min);
    }
}