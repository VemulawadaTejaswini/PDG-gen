import java.util.Scanner;
public class mamono {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long A = scan.nextInt();
        long B = scan.nextInt();

        long l = 0;
        long r = 1000000001;

        long h[] = new long[N];

        for (int i = 0; i < N; i++) {
            h[i] = scan.nextInt();
        }

        while (l < r - 1) {
            long m = (l + r) / 2;
            long temp[] = h;
            for (int i = 0; i < N; i++) {
                temp[i] -= B * m;
            }
            int x = 0;
            for (int i = 0; i < N; i++) {
                if (temp[i] > 0) {
                    if (temp[i] % (A - B) == 0) {
                        x += temp[i] / (A - B);
                    } else {
                        x += (temp[i] / (A - B)) + 1;
                    }
                }
            }
            if (x > m)
                l = m;
            else
                r = m;

        }

        System.out.println(r+1);
    }
}

