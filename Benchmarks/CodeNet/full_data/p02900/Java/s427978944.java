import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int ct = 1;

        List<Long> divisorsA = getFact(A);
        List<Long> divisorsB = getFact(B);

        for(long d: divisorsA) {
            if(divisorsB.contains(d)) {
                ct += 1;
            }
        }

        System.out.println(ct);
    }

    private static List<Long> getFact(long n) {
        List<Long> divs = new ArrayList<>();
        if(n% 2 == 0) {
            divs.add((long)2);
            while(n% 2 == 0) {
                n/= 2;
            }
        }

        for(long k = 3; k < Math.sqrt(n); k += 2) {
            if(n% k == 0) {
                divs.add(k);
                n/= k;
                while(n% k == 0) {
                    n/= k;
                }
            }
        }

        return divs;
    }
}