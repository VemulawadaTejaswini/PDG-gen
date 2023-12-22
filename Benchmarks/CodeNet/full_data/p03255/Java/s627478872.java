import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int total = (N + 1) * X;
        int distance = 0;

        for (int i = N; i > 0; i--) {
            distance = sc.nextInt() - distance;
            total = total +  distance +(distance * (i + 1) * (i + 1));
        }

        System.out.println(total);

    }
}





