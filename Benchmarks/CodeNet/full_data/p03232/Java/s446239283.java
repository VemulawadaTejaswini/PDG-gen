
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    static final long C = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.valueOf(scanner.nextLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(calc(A));
    }

    public static long calc(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        long cost = Arrays.stream(array).sum() % C;
        if (array.length == 1) {
            return cost;
        }

        // 末尾除き
        long sum = (cost * (array.length-1) + calc(Arrays.copyOfRange(array, 0, array.length-1))) % C;
        // 先頭除き
        sum += (cost * (array.length-1) + calc(Arrays.copyOfRange(array, 1, array.length))) % C;

        // 先頭・末尾のみは例外
        for (int i = 1; i < array.length-1; i++) {
            sum += (cost * (i) + calc(Arrays.copyOfRange(array, 0, i))) % C;
            sum += (cost * (array.length-i-1) + calc(Arrays.copyOfRange(array, i+1, array.length))) % C;
        }

        return sum;
    }



}
