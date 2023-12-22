import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(frog1(arr));

        scanner.close();

    }

  

    public static int frog1(int arr[]) {
        int sol[] = new int[arr.length];
        sol[arr.length - 1] = 0;
        for (int j = arr.length - 2; j >= 0; j--) {
            int cost1 = Integer.MAX_VALUE, cost2 = Integer.MAX_VALUE;
            if (j + 1 < arr.length) {
                cost1 = Math.abs(arr[j + 1] - arr[j]) + sol[j + 1];
            }
            if (j + 2 < arr.length) {
                cost2 = Math.abs(arr[j + 2] - arr[j]) + sol[j + 2];
            }
            sol[j] = Math.min(cost1, cost2);

        }
        return sol[0];
    }

   

}