import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        String[] s = new String[n];
        Arrays.setAll(s, i -> scanner.next());
        Arrays.sort(s);
        System.out.println(String.join("", s));
    }
}