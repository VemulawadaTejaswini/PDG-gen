import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] H;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            H = new long[N];
            for (int i = 0; i < N; i++) {
                H[i] = sc.nextLong();
            }
        }

        if (H.length == 1) {
            System.out.println("Yes");
            return;
        }
        if (H.length == 2 && H[0] - H[1] <= 1) {
            System.out.println("Yes");
            return;
        }

        for (int i = 1; i < N; i++) {
            if (H[i - 1] - H[i] > 1) {
                //1以上減少するケース
                System.out.println("No");
                return;
            } else if (H[i - 1] - H[i] == 1) {

                if (H[i - 2] == H[i - 1]) {
                    //減少させると2つ前のよりも減少するケース
                    System.out.println("No");
                    return;
                }else{
                    //減少させる
                    H[i - 1]--;
                }
            }
        }

        System.out.println("Yes");
        return;

    }
}
