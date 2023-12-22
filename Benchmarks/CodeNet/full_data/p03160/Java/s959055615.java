import java.util.Scanner;

class Frog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(execute(arr, n));
        sc.close();
    }

    private static int execute(int[] arr, int length) {
        int x = 0;
        int y = arr[1] - arr[0];
        for (int i = 2; i < length; i++) {
            int temp = y;

            y = Math.min(x + Math.abs(arr[i] - arr[i - 2]), y + Math.abs(arr[i] - arr[i - 1]));
            x = temp;
        }

        return Math.min(x, y);
    }
}
