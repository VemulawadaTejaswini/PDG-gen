import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = 0;
        int target = 1;
        while (target <= N) {
            int start = target;
            for (int i = 0; i < N; ++i) {
                if (array[i] == target) {
                    ++target;
                }
            }
            int value = target - start;
            if (max < value) {
                max = value;
            }
        }
        System.out.println(N - max);
    }
}