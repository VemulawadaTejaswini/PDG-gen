import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int A = sc.nextInt(), B = sc.nextInt();


                        int ans = 0;
                        if (B < 0 && A < 0) {
                                A *= -1;
                                B *= -1;
                                ans += 2;
                        } else if(B < 0) {
                                A *= -1;
                                B *= -1;

                        }
                        if (A > B) {
                                A *= -1;
                                ans++;
                        }
                        System.out.println(Math.min(B - A + ans, B + A + ans + 1));

                }
        }
}