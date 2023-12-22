import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ary = s.toCharArray();
        List<Character> oary = Arrays.asList('R', 'U', 'D');
        List<Character> eary = Arrays.asList('L', 'U', 'D');
        Set<Character> hso = new HashSet<>();
        Set<Character> hse = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 == 0) {
                hse.add(ary[i]);
            } else {
                hso.add(ary[i]);
            }
        }
        hso.removeAll(oary);
        hse.removeAll(eary);
        if (hso.isEmpty() && hse.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}