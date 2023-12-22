import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ary = new char[s.length()];
        ary = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (ary[i] == ary[i + 1]) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
            if (i != s.length() - 2 && ary[i] == ary[i + 2]) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}