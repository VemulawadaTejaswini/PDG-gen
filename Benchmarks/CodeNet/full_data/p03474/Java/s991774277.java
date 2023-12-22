import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        
        for (int i = 0; i < a; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                System.out.println("No");
                return;
            }
        }

        if (s.charAt(a) != '-') {
            System.out.println("No");
            return;
        }

        for (int i = a + 1; i < a + b + 1; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
