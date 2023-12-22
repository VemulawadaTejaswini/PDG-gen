import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean result = true;
        for (int i = 0; i < s.length() - 1 && result; i++) {
            if (i % 2 == 0){
                result = 'R' == s.charAt(i) || 'U' == s.charAt(i) || 'D' == s.charAt(i);
            } else {
                result = 'L' == s.charAt(i) || 'U' == s.charAt(i) || 'D' == s.charAt(i);
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}
