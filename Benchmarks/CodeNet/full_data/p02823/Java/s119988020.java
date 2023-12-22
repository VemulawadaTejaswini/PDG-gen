import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer a = Integer.parseInt(sc.next());
        Integer b = Integer.parseInt(sc.next());
        Integer diff = Math.abs(a-b);
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