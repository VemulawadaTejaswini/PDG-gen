import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        boolean canReach = true;
        int prevT = 0;
        int prevX = 0;
        int prevY = 0;
        for (int i = 0; i < N; i++) {
            int t = scanner.nextInt();
            int hereX = scanner.nextInt();
            int hereY = scanner.nextInt();
            int distance = Math.abs(hereX - prevX) + Math.abs(hereY - prevY);

            if (distance > t || distance % 2 != Math.abs(t - prevT) % 2) {
                canReach = false;
                break;
            }

            prevT = t;
            prevX = hereX;
            prevY = hereY;
        }

        System.out.println(canReach ? "Yes" : "No");
    }

}