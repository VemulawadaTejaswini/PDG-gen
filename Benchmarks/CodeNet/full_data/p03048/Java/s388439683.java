import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int cnt = 0;
        for (int r = 0; r <= (N + R - 1) / R; r++) {
            for (int g = 0; g <= (N + G - 1) / G; g++) {
                if (R * r + G * g > N) {
                    break;
                }
                for (int b = 0; b <= (N + B - 1) / B; b++) {
                    if (R * r + G * g + B * b == N) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}
