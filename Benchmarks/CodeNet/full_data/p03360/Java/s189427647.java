import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        for (int i = 0; i < k; i++) {
            arr[2] *= 2;
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
