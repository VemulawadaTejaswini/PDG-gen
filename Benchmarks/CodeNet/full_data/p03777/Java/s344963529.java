import java.util.Scanner;

/**
 * Created by User on 2017/03/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        if (a.equals("H")) {
            System.out.println(aaa(b) ? "H" : "D");
        } else {
            System.out.println(!aaa(b) ? "H" : "D");
        }
    }

    public static boolean aaa(String s) {
        if (s.equals("H")) {
            return true;
        } else {
            return false;
        }
    }
}
