import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final String s = sc.next();
        System.out.println(s.substring(0, k - 1) + 
            s.substring(k - 1, k).toLowerCase() + 
            s.substring(k, s.length()));
    }
}
