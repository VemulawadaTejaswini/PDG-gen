import java.util.Scanner;

/**
 * Created by dezhonger on 2019/4/13
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] c = new char[]{'0', '1'};
        int cc = 0;
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c[cc]) {
                count1++;
            }
            cc = 1 - cc;
        }

        int count2 = 0;
        cc = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c[cc]) {
                count2++;
            }
            cc = 1 - cc;
        }
        System.out.println(Math.min(count1, count2));

    }
}
