import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();

        int ans;

        int[] array = {a, b, c};

        Arrays.sort(array);

        for (int i = 0; i < k; i++) {
            array[2] *= 2;
        }

        ans = array[0] + array[1] + array[2];

        System.out.println(ans);

    }
}