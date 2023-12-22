import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        long nCount = 0;
        long k = 0;
        long i = 0;
        while (true) {
            if (D == 0) {
                k = N;
                break;
            }
            else if (i % Math.pow(100,D) == 0) {
                k = i;
                if (N == nCount++) break;
            }
            //i += Math.pow(100,D);
            i ++;//= Math.pow(100,D);
        }
        System.out.println(k);
    }
}
