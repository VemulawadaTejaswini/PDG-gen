
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans  = 0;
        int c = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.substring(i, i + 1).equals("B")) {
                c++;
            } else {
                ans += c;
            }
        }

        System.out.println(ans);

    }

}
