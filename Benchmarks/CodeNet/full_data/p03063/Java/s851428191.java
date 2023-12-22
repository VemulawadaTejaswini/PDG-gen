import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String s = scanner.next();
        System.out.println(s.replaceFirst("\\.*", "").replace("#", "").length());
    }
}