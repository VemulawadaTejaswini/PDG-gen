import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int i4 = sc.nextInt();

        int answer = 0;

        for (int i = 0; i <= i1; i++) {
            for (int j = 0; j <= i2; j++) {
                for (int k = 0; k <= i3; k++) {
                    if (i * 500 + j * 100 + k * 50 == i4) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
