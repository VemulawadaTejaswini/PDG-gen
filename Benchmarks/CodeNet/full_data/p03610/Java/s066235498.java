import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char tmp;
        String ans = "";
        for (int i = 0; s.length() > i; i++) {
            if (i % 2 == 0) {
                tmp = s.charAt(i);
                ans += String.valueOf(tmp);
            }
        }
        System.out.println(ans);
    }
}