import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] taps = sc.next().toCharArray();
        List<Character> odd = Arrays.asList('R', 'U', 'D');
        List<Character> even = Arrays.asList('L', 'U', 'D');
        for (int i = 0; i < taps.length; i++) {
            if ((i + 1) % 2 == 1) {
                if (!odd.contains(taps[i])) {
                    System.out.println("No");
                    return;
                }
            } else {
                if (!even.contains(taps[i])) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}