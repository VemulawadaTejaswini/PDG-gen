import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            reversed.append(c);
        }
        String part1 = s.substring(0, (s.length() - 1) / 2);
        StringBuilder part1Reversed = new StringBuilder();
        for (int i = part1.length() - 1; i >= 0; i--) {
            char c = part1.charAt(i);
            part1Reversed.append(c);
        }
        String part2 = s.substring((s.length() + 3) / 2 - 1);
        StringBuilder part2Reversed = new StringBuilder();
        for (int i = part2.length() - 1; i >= 0; i--) {
            char c = part2.charAt(i);
            part2Reversed.append(c);
        }
        if (s.equals(reversed.toString()) && part1.equals(part1Reversed.toString())
                && part2.equals(part2Reversed.toString())) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");

    }

}
