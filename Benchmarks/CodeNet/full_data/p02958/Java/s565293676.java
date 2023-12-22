import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }
        sc.close();

        if (Swap0or1(N, p, 1)) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
    public static boolean Swap0or1(int N, int[] p, int index) {
        if (index > N) {
            return false;
        }
        if (p[index-1] != index) {
            if (p[p[index-1]-1] != index) {
                return true;
            }
        }
        return Swap0or1(N, p, index + 1);
    } 
}
