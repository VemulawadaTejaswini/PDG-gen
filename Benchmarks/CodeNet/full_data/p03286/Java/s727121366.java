import java.util.Scanner;

class Main {
    static final Scanner IN = new Scanner(System.in);
    static final int N = Integer.parseInt(IN.next());
    public static void main(String... args) {
        System.out.println(calc(N));
    }
    static String calc(int x) {
        int d = x / (-2);
        int m = x % (-2);
        if (m == -1) {
            m = 1;
            d++;
        } 
        if (d == 0) {
            return Integer.toString(m);
        } else if (d == 1) {
            return "1" + Integer.toString(m);
        } else {
            return calc(d) + Integer.toString(m);
        }
    }
}