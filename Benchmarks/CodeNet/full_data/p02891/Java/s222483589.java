import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();

        if (s.length() == 1) {
            long result = k - (k / 2L);
            System.out.println(result);

        } else {
            long count = 0L;
            String[] arrS = s.split("");
            for (int i = 1; i < s.length(); i++) {
                if (arrS[i - 1].equals(arrS[i])) {
                    count++;
                    arrS[i] = "rp";
                }
            }
            long result = count * k;
            if (arrS[0].equals(arrS[s.length() - 1])) {
                result++;
            }

            long count2 = 0L;
            String[] arrS2 = s.split("");
            for (int i = s.length() - 1; i > 0 ; i--) {
                if (arrS2[i - 1].equals(arrS2[i])) {
                    count2++;
                    arrS2[i - 1] = "rp";
                }
            }
            long result2 = count2 * k;
            if (arrS2[0].equals(arrS2[s.length() - 1])) {
                result2++;
            }

            System.out.println(Math.min(result, result2));
        }
    }
}
