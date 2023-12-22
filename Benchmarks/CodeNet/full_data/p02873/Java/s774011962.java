import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long[] a = new long[s.length() + 1];
        Arrays.fill(a, -1);
        if (s.charAt(0) == '<') {
            a[0] = 0;
        }
        if (s.charAt(s.length() - 1) == '>') {
            a[s.length()] = 0;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '<' && s.charAt(i - 1) == '>') {
                a[i] = 0;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                a[i + 1] = a[i] + 1;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '>') {
                if (a[i + 1] >= a[i]) {
                    a[i] = a[i + 1] + 1;
                }
            }
        }
        System.out.println(Arrays.stream(a).sum());
    }
}