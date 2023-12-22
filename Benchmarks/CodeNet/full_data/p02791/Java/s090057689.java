import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int ans = 0;

        Loop: for (int i = N - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (array[i] > array[j]) {
                    continue Loop;
                }
            }
            ans++;
        }

        System.out.println(ans);
    }
}