import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 10) {
            System.out.println(b + 100 * (10 - a));
        } else {
            System.out.println(b);
        }
    }
}
