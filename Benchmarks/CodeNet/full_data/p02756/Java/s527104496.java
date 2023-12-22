import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int Q = scanner.nextInt();

        for(int x = 0; x<Q; x++) {
            int T = scanner.nextInt();

            if (T == 1) {
                S = new StringBuilder(S).reverse().toString();
            } else {
                int F = scanner.nextInt();
                String C = scanner.next();
                if (F == 1) {
                    S=C+S;
                } else {
                    S=S+C;
                }
            }
            scanner.nextLine();
        }
        System.out.println(S);

    }

}
