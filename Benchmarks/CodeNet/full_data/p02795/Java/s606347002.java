import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h;
        int w;
        int n;
        int count = 0;
        int longerArgs;
        int smallerArgs;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        h = scan.nextInt();
        w = scan.nextInt();
        n = scan.nextInt();

        longerArgs = h > w ? h : w;
        smallerArgs = h > w ? w : h;

        for (int i = 0; i < smallerArgs; i++) {
            sum += longerArgs;
            count++;
            if (sum >= n) {
                break;
            }
        }

        System.out.println(count);
        scan.close();

    }
}