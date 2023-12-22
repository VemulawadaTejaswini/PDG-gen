import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(frog2(arr, k));

        scanner.close();

    }

    public static int frog2(int arr[], int k) {
        int sol[] = new int[arr.length];
        sol[0] = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            int cost = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i + j < arr.length) {
                    cost = Math.min(Math.abs(arr[i + j] - arr[i]) + sol[i + j], cost);

                } else {
                    break;
                }
            }
            sol[i] = cost;
        }
        return sol[0];

    }

   

}