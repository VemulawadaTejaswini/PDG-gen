import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int k = cin.nextInt();
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }
        String result = null;
        for (int i = 0; i < k; i++) {
            result = set.pollFirst();
        }
        System.out.println(result);
    }
}
