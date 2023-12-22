import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();

        int h = scanner.nextInt();
        int w = scanner.nextInt();

        int area = h * W + w * H - h * w;

        int ans = H * W - area;

        System.out.println(ans);

    }

}
