import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        if (s[0] == s[1] && s[0] == s[2]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}