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
            int count = 0;
            String[] arrS = s.split("");
            for (int i = 1; i < s.length(); i++) {
                if (arrS[i - 1].equals(arrS[i])) {
                    count++;
                    arrS[i] = "rp";
                }
            }
            long result = (long) count * k;
            if (arrS[0].equals(arrS[s.length() - 1])) {
                result++;
            }
            System.out.println(result);
        }
    }
}
