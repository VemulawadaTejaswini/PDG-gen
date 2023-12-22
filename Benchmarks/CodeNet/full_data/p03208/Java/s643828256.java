import java.util.*;

class Main {
    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ", 2);
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);

        long[] arr2 = new long[n-1];
        for (int i = 0; i < n - 1; i++) {
            arr2[i] = arr[i+1] - arr[i];
        }

        Arrays.sort(arr2);
        long sum = 0;
        for (int i = 0; i < k-1; i++) {
            sum += arr2[i];
        }
        System.out.println(sum);
    }
}
