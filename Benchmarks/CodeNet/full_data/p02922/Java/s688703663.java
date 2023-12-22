import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        System.out.println(PowerSocket(1, A, B));
    }
    public static int PowerSocket(int SocketNum, int A, int B) {
        if (SocketNum >= B) {
            return 0;
        }
        return 1 + PowerSocket(SocketNum + A - 1, A, B);
    }
}
