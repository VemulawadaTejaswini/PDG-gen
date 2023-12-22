import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args){

        int N;
        long[] Ln;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ln = new long[N];
            for (int i = 0; i < Ln.length; i++) {
                Ln[i] = sc.nextLong();
            }

        }
        long result = 0;
        Arrays.sort(Ln);


        for (int i = 0; i < Ln.length; i++) {
            for (int j = i + 1; j < Ln.length; j++) {
                int start = j + 1;
                int end = Ln.length;
                long val = Ln[i] + Ln[j] +1;

                start--;
                while (end - start > 1) {
                    int mid = start + (int)Math.floor((end- start) / 2);
                    if (Ln[mid] < val) {
                        start = mid;
                    } else {
                        end = mid;
                    }
                }
                int add = (end-1) -j;
                result += add;
            }
        }
        System.out.println(result);

    }
}