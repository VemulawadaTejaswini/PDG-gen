import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l0 = 2;
        long l1 = 1;
        for (int i = 2; i <= n; i++) {
            long temp = l1;
            l1 += l0;
            l0 = temp;
        }
        System.out.println(l1);
    }
}
