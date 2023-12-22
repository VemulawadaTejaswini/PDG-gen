import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "ACTG";
        int lo = 0, hi = 0, n = s.length(), count = 0;
        while (hi < n) {
            char left = s.charAt(lo), right = s.charAt(hi);
            if (a.contains(String.valueOf(left)) && a.contains(String.valueOf(right))) {
                hi++;
            } else {
                if (lo != hi) {
                    count = Math.max(count, hi - lo);
                }
                hi++;
                lo = hi;
            }
        }
        System.out.println(count);
        sc.close();
    }
}