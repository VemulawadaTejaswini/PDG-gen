import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int h = in.nextInt();

            if (h >= k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
