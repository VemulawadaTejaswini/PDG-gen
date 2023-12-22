import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int A = Integer.parseInt(sc.nextLine());

        boolean isCan = false;
        int amari = N % 500;

        if (A - amari <= 0) {
            isCan = true;
        }

        if (isCan) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}