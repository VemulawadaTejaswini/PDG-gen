import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c2 = 0;
        int c4 = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            Long l = sc.nextLong();
            if (l % 4 == 0) {
                c4++;
            } else if (l % 2 == 0) {
                c2++;
            } else {
                c++;
            }
        }
        if (c2 == 0) {
            if (c <= c4 + 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (c <= c4) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
