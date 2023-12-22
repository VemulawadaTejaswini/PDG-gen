import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int prev = -1;
        int res = 0;
        int i = -1;
        for (char c : t.toCharArray()) {
            i = s.indexOf(c);
            if (i == -1) {
                System.out.println("-1");
                return;
            }
            if (i <= prev) {
                res++;
            }
            prev = i;
        }
        System.out.println(s.length() * res + i + 1);
    }
}
