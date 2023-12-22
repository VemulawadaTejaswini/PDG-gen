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

        if (Swap0or1(N, p, 1, 0)) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
    public static boolean Swap0or1(int N, int[] p, int index, int times) {
        if (index > N) {
            return false;
        }
        if (p[index-1] != index) {
            if (p[p[index-1]-1] != index || times == 1) {
                return true;
            }
            p[p[index-1]-1] = p[index-1];
            p[index-1] = index;
            return Swap0or1(N, p, index + 1, times + 1);
        }
        return Swap0or1(N, p, index + 1, times);
    } 
}
