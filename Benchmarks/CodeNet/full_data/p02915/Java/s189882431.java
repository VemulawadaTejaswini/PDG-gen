import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<String> passwords = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            String password = Integer.toString(i);
            for (int j = 1; j <= n; j++) {
                password += j;
                for (int k = 1; k <= n; k++) {
                    passwords.add(password += k);
                }
            }
        }

        System.out.println(passwords.size());
    }
}
