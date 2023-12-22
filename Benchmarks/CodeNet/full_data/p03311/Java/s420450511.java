import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] a = scanner.nextLine().split(" ");
        int[] array = new int[N];

        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(a[i]) - (i + 1);
        }
        Arrays.sort(array);

        int c = array[N / 2];
        long sum = 0;
        for (int i = 0; i < N; ++i) {
            sum += Math.abs(array[i] - c);
        }
        System.out.println(sum);
    }
}