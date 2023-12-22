import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        String sFront = s.substring(0, n / 2);
        String sBack = s.substring(n / 2, n);
        if (n % 2 != 0 || !sFront.equals(sBack)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
