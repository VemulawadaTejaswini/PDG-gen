import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean no = false;
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            if (s % 2 == 0) {
                if (s % 5 != 0 && s % 3 != 0) {
                    no = true;
                }
            }
        }
        if (no)
            System.out.println("DENIED");
        else
            System.out.println("APPROVED");
    }
}
