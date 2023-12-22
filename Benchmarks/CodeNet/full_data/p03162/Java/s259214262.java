import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i < n; i++) {
            arr[i][0] += Math.max(arr[i-1][1],arr[i-1][2]);
            arr[i][1] += Math.max(arr[i-1][0],arr[i-1][2]);
            arr[i][2] += Math.max(arr[i-1][1],arr[i-1][0]);
        }
        System.out.println(Math.max(Math.max(arr[n-1][0],arr[n-1][1]),arr[n-1][2]));
    }
}
