import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static final void main(String[] args) {
        String in = sc.next();
        if (in.length() < 4) {
            System.out.println("NO");
            System.exit(0);
        }
        String s = in.substring(0, 4);
        if (s.contains("YAKI")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}