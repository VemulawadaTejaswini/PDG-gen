import java.util.*;

class Main {
    public static int pay(int N) {
        int ret = N / 15 * 200;
        return N*800 - ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print(pay(N));
    }
}