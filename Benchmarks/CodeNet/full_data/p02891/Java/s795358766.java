import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();

        if (s.length() == 1) {
            long result = k / 2L;
            System.out.println(result);

        } else {
            long result = Math.min(countOverlap(s, k, "S"), countOverlap(s, k, "E"));
            System.out.println(result);
        }
    }

    public static long countOverlap(String s, long k ,String start) {
        long count = 0L;
        String[] arrS = s.split("");
        if ("S".equals(start)) {
            for (int i = 1; i < s.length(); i++) {
                if (arrS[i - 1].equals(arrS[i])) {
                    count++;
                    arrS[i] = "rp";
                }
            }
        } else {
            for (int i = s.length() - 1; i > 0 ; i--) {
                if (arrS[i - 1].equals(arrS[i])) {
                    count++;
                    arrS[i - 1] = "rp";
                }
            }
        }
        long result = count * k;
        if (arrS[0].equals(arrS[s.length() - 1]) && k != 1) {
            result++;
        }
        return result;
    }
}
