import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String s = a + b;
        int c = Integer.parseInt(s);
        double r = Math.sqrt(c);
        if (r == (int) r)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}