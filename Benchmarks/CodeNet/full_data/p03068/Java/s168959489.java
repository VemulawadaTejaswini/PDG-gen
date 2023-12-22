import java.util.Scanner;

/**
 * @author subaru
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
        char targetChar = S.charAt(K);
        StringBuilder result = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c == targetChar) {
                result.append(c);
            } else {
                result.append("*");
            }
        }
        System.out.println(result);
    }
}
