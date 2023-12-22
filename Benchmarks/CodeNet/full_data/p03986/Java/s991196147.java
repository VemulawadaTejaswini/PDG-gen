import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        for (int i = 0;i < 100000;i++) {
            int l = s.length();
            s = s.replaceFirst("ST","");
            if (l==s.length()) {
                System.out.println(l);
                break;
            }
        }
    }
}
