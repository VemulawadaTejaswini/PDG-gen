
import java.util.Scanner;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int next = 8;

        for (char tmp : s.toCharArray()) {
            if (tmp == 'o') next--;
        }

        System.out.println(next - (15 - s.length()) <= 0 ? "YES" : "NO");

    }
}