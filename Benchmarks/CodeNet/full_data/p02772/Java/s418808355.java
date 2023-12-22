import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean v = true;
        for (int i = 0; i < n; ++i) {
            int ai = sc.nextInt();
            if (ai % 2 == 0 && (ai % 3 != 0 && ai % 5 != 0)) {
                v = false;
                break;
            }
        }
        System.out.println(v ? "APPROVED" : "DENIED");
    }
}
