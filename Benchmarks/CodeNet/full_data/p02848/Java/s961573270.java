import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] chars = sc.next().toCharArray();
        int c;
        for (int i = 0; i < chars.length; i++) {
            c = ((int) chars[i] + n);
            if (c > 90) {
                c -= 26;
            }
            System.out.print((char) c);
        }
    }
}