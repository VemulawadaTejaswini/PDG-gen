import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int H = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();
        int N = sc.nextInt();

        int Hmin = Q*2 < H ? Q*2 : H;
        int Smin = Hmin*2 < S ? Hmin*2 : S;
        int Dmin = Smin*2 < D ? Smin*2 : D;
        
        long price = (long) N/2 * Dmin + N%2 * Smin;
        System.out.println(price);
    }
}
