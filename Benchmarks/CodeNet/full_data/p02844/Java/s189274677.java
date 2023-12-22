import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            int[] c = new int[] { i / 100, (i / 10) % 10, i % 10 };
            int f = 0;
            for (int j = 0; j < n; j++) {
                if ((s.charAt(j) + "").equals(("" + c[f]))) {
                    f++;
                }
                if (f == 3) {
                    break;
                }
            }
            if (f == 3) {
                count++;
            }
        }

        System.out.println(count);
    }
}