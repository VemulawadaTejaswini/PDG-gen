import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int N, A, B, K;
        int red, green, blue, vac;
        int magic = 998244353;
        int judge;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        K = sc.nextInt();

        for (red = 0; red < N; red++) {
            for (green = 0; green < N; green++) {
                for (blue = 0; blue < N; blue++) {
                    vac = red + green + blue;
                    judge = A * red + (A + B) * green + B * blue;
                    if (judge == K) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count%magic);
    }
}
