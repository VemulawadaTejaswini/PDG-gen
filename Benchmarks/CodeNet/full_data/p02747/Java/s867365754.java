import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        if (c.length %2 != 0) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0) {
                if (c[i] != 'h') {
                    System.out.println("No");
                    return;
                }
            } else {
                if (c[i] != 'i') {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
