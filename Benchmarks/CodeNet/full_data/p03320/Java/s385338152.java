import java.util.*;

public class Main {
    public void main(Scanner sc) {
        long k = sc.nextLong();

        String s = "";
        while (k != 0) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(i + s);
                k--;
                if (k == 0) {
                    break;
                }
            }
            s = s + "9";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
