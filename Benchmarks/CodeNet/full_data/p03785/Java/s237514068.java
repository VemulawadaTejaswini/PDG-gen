import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long[] t = new long[n];
        for(int i=0; i<n; i++) {
            t[i] = sc.nextLong();
        }

        Arrays.sort(t);
        int bus = 0;
        int ppl = 0;
        for(int i=0; i<n; i++) {
            long limit = t[i]+k;
            while(i+1 < n && limit > t[i+1]) {
                ppl++;
                if(ppl > c) break;
                i++;
            }
            bus++;
        }
        System.out.println(bus);
    }
}
