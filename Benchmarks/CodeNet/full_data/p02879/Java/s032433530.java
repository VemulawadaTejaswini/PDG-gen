import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a <= 9 && a > 0 && b <= 9 && b > 0) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }
    }
}