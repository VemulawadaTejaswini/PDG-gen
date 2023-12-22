import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        sc.close();

        System.out.println(Math.min(N*A, B));
    }
}