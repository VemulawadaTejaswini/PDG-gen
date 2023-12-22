import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int A = sc.nextInt(), B = sc.nextInt();

                        if (B > A) {
                                System.out.println(Math.min(B - A, B + A + 2));
                        } else {
                                System.out.println(Math.min(A - B + 2, -A - B + 1));
                        }
                }
        }
}