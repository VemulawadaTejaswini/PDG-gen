import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int a = scan.nextInt();
        long b = scan.nextLong();
        int[] h = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = scan.nextInt();
        }

        int l = 0;
        int r = 1000000001;
        while(l<r-1) {
            long count = 0;
            long[] k = new long[N];
            for(int i = 0; i < N; i++) {
                k[i] = h[i];
            }
            int m = (l+r)/2;
            for(int  i = 0; i < N; i++) {
                k[i] -= b*m;
                if(k[i] > 0) {
                    if(k[i]%(a-b)==0) {
                        count += k[i]/(a-b);
                    }
                    else {
                        count = count + (k[i]/(a-b)) + 1;
                    }
                }
            }
            if(count > m) {
                l = m;
            }
            else if(count <= m) {
                r = m;
            }
        }
        System.out.println(r);
    }
}
