import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int[] minA = new int[n];
        minA[0] = 0;
        minA[1] = Math.abs(arr[1] - arr[0]);
        for(int i = 2; i < n; i++){
            minA[i] = Math.min(Math.abs(arr[i] - arr[i - 1]) + minA[i - 1], Math.abs(arr[i] - arr[i - 2]) + minA[i - 2]);
        }

        System.out.println(minA[n - 1]);

    }
}
