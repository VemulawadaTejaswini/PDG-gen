import java.util.Scanner;

/**
 * @author Vicfred
 * 11/3/18
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        int h[] = new int[N];
        int a,b,c;
        a = b = c = -1;
        for(int i = 0; i < N; ++i) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            h[i] = scanner.nextInt();
            if(h[i] > 0) {
                a = x[i];
                b = y[i];
                c = h[i];
            }
        }
        for(int i = 0; i <= 100; ++i) {
            for(int j = 0; j <= 100; ++j) {
                int H = c + Math.abs(a-i) + Math.abs(b-j);
                H = Math.max(H,0);
                boolean flag = true;
                for(int k = 0; k < N; ++k) {
                    int HH = H - Math.abs(x[k] - i) - Math.abs(y[k] - j);
                    HH = Math.max(HH, 0);
                    if(HH != h[k]) {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    System.out.println(i+" "+j+" "+H);
            }
        }
    }
}
