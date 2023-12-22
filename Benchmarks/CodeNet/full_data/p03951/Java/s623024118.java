import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        String s = stdin.nextLine();
        String t = stdin.nextLine();

        if (s.equals(t)) {
            System.out.println(n);
            System.exit(0);
        }

        s = new StringBuilder(s).reverse().toString();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) break;
            c++;
        }
        System.out.println(n * 2 - c);
    }

}