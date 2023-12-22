import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n * a < b) {
            System.out.println(n * a);
        } else {
            System.out.println(b);
        }
    }
}
