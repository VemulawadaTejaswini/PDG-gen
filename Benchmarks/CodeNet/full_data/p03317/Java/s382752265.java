import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] array = new int[N];

        int positionOfOne = -1;

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
            if (array[i] == 1) {
                positionOfOne = i;
            }
        }

        int left = (positionOfOne + (K - 2)) / (K - 1);
        int right = (N -  positionOfOne - 2 + (K - 1)) / (K - 1);

        System.out.println(right + left);
    }
}
