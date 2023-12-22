import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String A = in.next();
            String B = in.next();
            String C = in.next();

            int count = 0;
            for (int i = 0; i < N; i++) {
                char a = A.charAt(i);
                char b = B.charAt(i);
                char c = C.charAt(i);
                boolean ab = a == b;
                boolean bc = b == c;
                boolean ca = c == a;
                if (ab) {
                    if (bc) {
                        continue;
                    } else {
                        count++;
                        continue;
                    }
                } else {
                    if (bc || ca) {
                        count++;
                        continue;
                    } else {
                        count++;
                        count++;
                        continue;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
