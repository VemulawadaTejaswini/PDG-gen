import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = a + b;
        int y = a + c;
        int z = b + c;
        if (x < y && x < z) {
            System.out.println(x);
        } else if (y < x && y < z) {
            System.out.println(y);
        } else if (z < x && z < y) {
            System.out.println(z);
        } else {
            System.out.println(x);
        }
    }
}