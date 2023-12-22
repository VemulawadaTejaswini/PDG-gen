import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(a == b ? 1 : 0);
        } else {
            System.out.println((n-2) * (b-a) + 1);
        }
    }
}
