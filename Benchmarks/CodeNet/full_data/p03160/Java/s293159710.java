import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] map = new int[n];
        Arrays.fill(map, -1);

        map[n-1] = 0;
        for (int i = n-2; i >= 0; i--) {
            map[i] = Math.abs(arr[i+1]-arr[i]) + map[i+1];
            if (i+2 < n) {
                map[i] = Math.min(map[i], Math.abs(arr[i+2]-arr[i]) + map[i+2]);
            }
        }
        System.out.println(map[0]);
    }
}
