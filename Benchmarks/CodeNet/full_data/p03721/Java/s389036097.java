import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (k <= b) {
                System.out.println(a);
                return;
            }
            k -= b;
        }
    }
}