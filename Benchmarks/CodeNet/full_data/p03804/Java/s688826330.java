import java.util.*;

public class Main {
    public static void main(String[] args) {
        test();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[] a = new String[N];
        String b = "";
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLine();
        }
        for (int i = 0; i < M; i++) {
            b += sc.nextLine();
        }
        System.out.println(b);

        for (int i = 0; i < N-M; i++) {
            for (int j = 0; j < N-M; j++) {
                String l = "";
                for (int k = 0; k < M; k++) {
                    l += a[j+k].substring(i, i+M);
                }
                System.out.println(l);
                if (l.equals(b)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");

    }
    
    private static int calc(int x) {

        return x;
    }
    
    private static void test() {
        assert calc(0) == 0;
    }
}
