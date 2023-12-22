import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = a + String.valueOf(b);
        int val = Integer.valueOf(s);
        for (int i = 0; i < 1000; i++) {
            if (i * i == val) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
