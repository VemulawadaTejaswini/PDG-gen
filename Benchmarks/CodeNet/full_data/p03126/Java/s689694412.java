import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] array = new int[m];
        Arrays.fill(array, 0);
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            for (int i1 = 0; i1 < k; i1++)
                array[scanner.nextInt() - 1]++;
        }

        int count = 0;
        for (int i : array)
            if (i == n)
                count++;
        System.out.println(count);
    }
}