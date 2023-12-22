import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
char c[] = str.toCharArray();
        if (c[2] == c[3] && c[4] == c[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
