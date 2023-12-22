import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.next());
        long a = Integer.parseInt(sc.next());
        long b = Integer.parseInt(sc.next());
        long diff = Math.abs(a-b);
        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        }
        else {
            if (n - a < b) {
                System.out.println(n-a);
            }
             else {
                System.out.println(b-1);
            }
        }
    }
}