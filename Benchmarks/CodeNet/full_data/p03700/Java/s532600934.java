import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long A = scan.nextLong();
        long B = scan.nextLong();
        long h[] = new long[N];

        for (int i = 0; i < N; i++) {
            h[i] = scan.nextLong();
        }

        long l = 0;
        long r = 1000000000 + 1;

        while (l < r - 1) {
            long m = (l + r) / 2;
            long temp[] = new long[N];
            for(int i = 0;i < N;i++)
                temp[i] = h[i];
            for (int i = 0; i < N; i++) {
                temp[i] -= B * m;
            }
            long x = 0;
            for (int i = 0; i < N; i++) {
                if (temp[i] > 0) {
                    if (temp[i] % (A - B) == 0) {
                        x += temp[i] / (A - B);
                    } else {
                        x += temp[i] / (A - B) + 1;
                    }
                }
            }
                if(m < x){
                    l = m;
                }else{
                    r = m;
                }
            }
        System.out.println(r);
    }
}
