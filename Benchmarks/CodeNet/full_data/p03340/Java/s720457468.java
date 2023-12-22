import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] a = scanner.nextLine().split(" ");
        int[] array = new int[N];

        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(a[i]);
        }

        long count = 0;
        for (int i = 0; i < N; ++i) {
            ++count;
            int work = array[i];
            for (int j = i + 1; j < N; ++j) {
                if ((work & array[j]) == 0) {
                    work |= array[j];
                    ++count;
                } else {
                    break;
                }
            }
        }

         System.out.println(count);
    }
}