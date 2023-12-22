import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n %= 500;
        int a = sc.nextInt();
        if (a >= n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
