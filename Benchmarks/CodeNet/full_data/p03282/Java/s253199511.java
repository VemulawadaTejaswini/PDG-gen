import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('1' == c) {
                continue;
            }
            if (k < i + 1) {
                System.out.println(1);
            } else {
                System.out.println(c);
            }
            return;
        }
        System.out.println(1);
    }

}
