import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        int A = 10000;
        int B = 5000;
        int C = 1000;

        int sum;
        int exist = 0;
        out: for (int ai = 0; ai <= N; ai++) {
            for (int bi = 0; bi<=N; bi++) {
                for (int ci = 0; ci<=N; ci++) {
                    if ((ai + bi + ci) > N) {
                        continue;
                    }
                    sum = ai * A + bi * B + ci * C;
                    if (sum == Y) {
                        System.out.println(ai + " " + bi + " " + ci);
                        exist = 1;
                        break out;
                    }
                }
            }
        }
        if (exist == 0) {
            System.out.println("-1 -1 -1");
        }
    }
}
