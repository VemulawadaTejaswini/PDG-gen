import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        sc.close();

        StringBuilder sb = new StringBuilder(b);
        b = sb.reverse().toString();

        if (a.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
