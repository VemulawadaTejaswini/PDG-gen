import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            if (temp % 2 == 0) {
                if (temp % 5 != 0 && temp % 3 != 0) {
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        System.out.println("APPROVED");
    }
}