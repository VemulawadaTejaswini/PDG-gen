import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int d = s.length / 2;
        boolean flg = true;
        for (int i = 0 ; i < d ; i++) {
            if (s[i] != s[s.length - 1 - i]) {
                flg = false;
            }
        }
        int c = d / 2;
        for (int i = 0 ; i < c ; i++) {
            if (s[i] != s[d - i - 1]) {
                flg = false;
            }
            if (s[i + d + 1] != s[s.length - 1 - i]) {
                flg = false;
            }
        }

        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
