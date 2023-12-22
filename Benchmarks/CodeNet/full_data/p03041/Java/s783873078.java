import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (i == k - 1) {
                System.out.print(Character.toLowerCase(s.charAt(i)));
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}