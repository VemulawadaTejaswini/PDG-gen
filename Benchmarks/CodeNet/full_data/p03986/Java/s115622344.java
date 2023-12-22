import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int len = x.length();
        int c = 0;
        for (int i = 0; i + 1 < len; i++) {
            if (x.charAt(i) == 'S' && x.charAt(i + 1) == 'T') {
                x = x.substring(0, i) + x.substring(i + 2);
                i = Math.max(-1, i - 2);
                len -= 2;
                c ++;
            }
        }
        System.out.println(len);
    }
}