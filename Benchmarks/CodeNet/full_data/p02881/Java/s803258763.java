import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        long y = N;
        long a = 1;
        long b = 1;
        boolean toggle = true;

        if (isPrime(N)) {
            System.out.println(N - 1);
            return;
        }

        long[] val = new long[1000];
        int x = 0;
        for (long i = 2; y >= i; i++) {
            while ((y % i) == 0) {
                y = y / i;
//                System.out.println(i);
                val[x] = i;
                x++;
            }
        }

        for(int xx = x-1; xx >= 0; xx--) {
            if(a * val[xx] > b * val[xx]) {
                b *= val[xx];
            }else {
                a *= val[xx];
            }
        }
        System.out.println(a + b - 2);
    }

    private boolean isPrime(long n) {
        // nが1以下ならfalse
        if (n <= 1) {
            return false;
        }
        // nが2または3ならtrue
        if (2 == n || 3 == n) {
            return true;
        }
        // nが2の倍数ならfalse
        if (0 == n % 2) {
            return false;
        }
        // nの平方根を整数で取得(5なら2, 10なら3)
        long square_root = (long) Math.sqrt(n);
        // nがnの平方根以下の、3以上の奇数(3,5,7,9,11,...)で1回でも割れたらfalse
        for (long i = 3; i <= square_root; i += 2) {
            if (0 == n % i) {
                return false;
            }
        }
        // 上記すべて回避したらtrue
        return true;
    }
}
