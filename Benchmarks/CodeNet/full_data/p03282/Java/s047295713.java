import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();

        sc.close();

        if (s.length() == 1) {
            System.out.println(s);
        } else if (s.charAt(0) != '1') {
            System.out.println(s.substring(0, 1));
        } else if (s.charAt(0) == '2') {
            System.out.println(s.substring(1, 2));
        } else {
            System.out.println(s.substring(2, 3));
        }
    }
}