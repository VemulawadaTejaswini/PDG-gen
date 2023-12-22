import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int X = Integer.parseInt(array[1]);

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; ++i) {
                int m = Integer.parseInt(scanner.nextLine());
                if (min > m) {
                    min = m;
                }
                X -= m;
            }

            System.out.println(N + (X / min));
        }
    }
}