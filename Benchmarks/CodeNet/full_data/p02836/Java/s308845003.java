import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int l = 0, r = s.length() - 1;

        int count = 0;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                count++;
            }

            l++; r--;
        }

        System.out.println(count);
    }
}
