import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] chars = sc.next().toCharArray();
        long K = sc.nextLong();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '1') {
                System.out.println(chars[i]);
                return;
            }
        }
        System.out.println('1');
    }
}
