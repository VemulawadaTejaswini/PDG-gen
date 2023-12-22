import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = sc.next();

        for (int i = 0; i < n; i++) {
            System.out.printf("%s%s",s.charAt(i), t.charAt(i));
        }
        System.out.printf("\n");
    }
}
