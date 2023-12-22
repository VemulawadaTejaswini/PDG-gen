import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        int cnt = 1;
        for (int i=0; i<N; i++) {
            H[i] = sc.nextInt();
            if (i == 0) {
                continue;
            }
            boolean isView = true;
            for (int j=0; j<H.length; j++) {
                if (H[j] > H[i]) {
                    isView = false;
                    break;
                }
            }
            if (isView)
                cnt++;
        }
        System.out.println(cnt);
    }
}