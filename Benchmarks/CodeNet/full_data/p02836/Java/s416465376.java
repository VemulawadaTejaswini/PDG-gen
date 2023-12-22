import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            result = s.charAt(i) != s.charAt(s.length() - 1 - i) ? result + 1 : result;
        }

        System.out.println(result);

        sc.close();
    }
}
