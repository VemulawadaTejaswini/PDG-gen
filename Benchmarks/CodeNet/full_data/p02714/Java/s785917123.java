import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        int ans = 0;
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    if (c - b == b - a) continue;
                    if (check(s.charAt(a), s.charAt(b), s.charAt(c))) ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean check(char a, char b, char c) {
        if (a != b && a != c && b != c) {
            return true;
        } else {
            return false;
        }
    }
}