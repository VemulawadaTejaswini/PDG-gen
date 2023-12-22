import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner scanner = new scanner(System.in);
        String s = scanner.next();
        if (s.charAt(2) == s.charAt(4) && s.charAt(4) == s.charAt(5)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
