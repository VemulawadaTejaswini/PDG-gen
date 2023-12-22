import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B - A >= 2019) {
            System.out.println(0);
        }
        else {
            int answer = Integer.MAX_VALUE;
            for (int i = A; i < B; i++) {
                for (int j = A+1; j < B+1; j++) {
                    answer = Math.min(answer, (i * j) % 2019);
                }
            }
            System.out.println(answer);
        }
    }
}
