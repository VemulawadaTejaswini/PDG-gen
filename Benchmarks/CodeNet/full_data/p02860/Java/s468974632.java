import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if ((n & 1) == 1) {
            System.out.println("No");
            sc.close();
            return;
        }
        String h = s.substring(0, n >> 1);
        if ((h + h).equals(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
