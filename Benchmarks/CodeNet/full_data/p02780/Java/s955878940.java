import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int selected = scanner.nextInt();

        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        double maxSum = 0;
        int start = 0;
        for (int i = 0; i <= size - selected; i++) {
            double current = 0;
            for (int j = i; j < i + selected; j++) {
                current += input[j];
            }
            if (current > maxSum) {
                start = i;
                maxSum = current;
            }
        }

        double answer = 0;
        for (int i = start; i < start + selected; i++) {
            double current = input[i];
            double sum = (current * (current + 1)) / 2 / current;
            answer += sum;
        }
        System.out.println(answer);
    }
}
