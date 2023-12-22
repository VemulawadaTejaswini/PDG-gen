import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = 700;
        if (s.charAt(0) == 'o') n += 100;
        if (s.charAt(1) == 'o') n += 100;
        if (s.charAt(2) == 'o') n += 100;

        System.out.println(n);
    }
}