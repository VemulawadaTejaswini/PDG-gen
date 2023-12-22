import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char s[] = sc.next().toCharArray();
        long k = sc.nextLong();

        if (s[0] != '1') {
            System.out.println(s[0]);
            return;
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i] != '1') {
                System.out.println(s[i]);
                break;
            }
            if (i + 1 == k) {
                System.out.println(1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
