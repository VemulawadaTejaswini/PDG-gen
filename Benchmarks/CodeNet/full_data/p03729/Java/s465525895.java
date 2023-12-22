import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        boolean isShiritori = A.endsWith(String.valueOf(B.charAt(0)))
                && B.endsWith(String.valueOf(C.charAt(0)));

        System.out.println(isShiritori ? "YES":"NO");
    }
}
