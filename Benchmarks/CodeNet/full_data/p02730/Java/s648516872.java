import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        for (int i = 0; i < s.length / 2; i++) {
            if (!s[i].equals(s[s.length - 1 - i])) {
                System.out.println("No");
                return;
            }
        }

        // 前半が回文

        for (int i = 0; i < s.length / 4; i++) {
            if (!s[i].equals(s[s.length / 2 - 1 - i])) {
                System.out.println("No");
                return;
            }
        }

        // 後半が回文

        for (int i = s.length / 2; i < s.length; i++) {
            if (!s[i].equals(s[s.length - 1 - i])) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}