import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            int a = (s.charAt(i) + n);
            if (a > 90) {
                a = a % 90 + 64;
            }
            System.out.print((char)(a));
        }
    }
}