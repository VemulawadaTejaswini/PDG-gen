import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] s = scan.nextLine().toCharArray();
        if(s[0] == s[1] && s[1] == s [2] || s[1] == s [2] && s[2] == s [3]) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
