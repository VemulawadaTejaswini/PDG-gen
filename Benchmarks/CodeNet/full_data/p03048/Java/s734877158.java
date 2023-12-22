
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int N = sc.nextInt();

        int result = 0;

        for (int r = 0; r <= N; r += array[2]) {
            for (int g = 0; g <= N; g += array[1]) {
                for (int b = 0; b <= N; b += array[0]) {
                    if ((r + g + b) == N) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
