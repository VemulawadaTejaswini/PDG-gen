import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[] cs = sc.next().toCharArray();
        long k = sc.nextLong();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '1' && (i + 1) == k) {
                System.out.println(cs[i]);
                break;
            }
            else if (cs[i] != '1') {
                System.err.println(cs[i]);
                break;
            }
        }
    }
}
