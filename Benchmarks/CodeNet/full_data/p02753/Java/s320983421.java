import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        Set<Character> hs = new HashSet<>();
        for (char c : ch)
            hs.add(c);
        if (hs.size() >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}