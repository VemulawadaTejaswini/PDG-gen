import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        long K = scan.nextLong();
        Integer A[] = new Integer[N];
        Integer F[] = new Integer[N];

        for(int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++) {
            F[i] = scan.nextInt();
        }

        FA fa[] = new FA[N];
        Arrays.sort(A, Comparator.reverseOrder());
        Arrays.sort(F);

        for(int i = 0; i < N; i++) {
            fa[i] = new FA();
            fa[i].A = A[i];
            fa[i].F = F[i];
            fa[i].product = A[i]*F[i];
        }


        for(int i = 0; i < K; i++) {
            Arrays.sort(fa, Comparator.comparingLong(FA::getProduct).reversed());
            if(fa[0].product > 0) {
                fa[0].A = fa[0].A - 1;
                fa[0].product = fa[0].A * fa[0].F;
            }
            else
                break;
        }

        Arrays.sort(fa, Comparator.comparingLong(FA::getProduct).reversed());

        os.println(fa[0].product);

    }

    public static class FA {
        public long F = 0;
        public long A = 0;
        public long product = 0;

        public long getProduct() {
            return product;
        }
    }
}