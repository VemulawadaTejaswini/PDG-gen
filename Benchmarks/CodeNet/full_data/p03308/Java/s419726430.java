import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (max < temp) max = temp;
            if (min > temp) min = temp;
        }
        System.out.println(max - min);
    }
}
