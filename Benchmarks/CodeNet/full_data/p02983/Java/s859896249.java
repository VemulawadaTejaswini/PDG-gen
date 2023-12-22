import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int answer = (A * B) % 2019;
        for (int i = A; i < Math.min(B, A+2018)-1; i++) {
            for (int j = A+1; j < Math.min(B, A+2018); j++) {
                answer = Math.min(answer, (i * j) % 2019);
            }
        }

        System.out.println(answer);
    }
}
