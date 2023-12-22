import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set  = new HashSet<>();
        for (char c  : s.toCharArray()) {
            set.add(c);
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (!set.contains(c)) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("None");
    }
}