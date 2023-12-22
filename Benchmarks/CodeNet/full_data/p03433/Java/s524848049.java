import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int A = Integer.parseInt(sc.nextLine());

        boolean isCan = false;
        int amari = N % 500;

        if (amari == 0) {
            isCan = true;
        } else {
            for (int i = 0; i <= A; i++) {
                amari -= i;
                if (amari == 0) {
                    break;
                }
            }
            isCan = amari == 0 ? true : false;
        }

        if (isCan) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }
    }
}