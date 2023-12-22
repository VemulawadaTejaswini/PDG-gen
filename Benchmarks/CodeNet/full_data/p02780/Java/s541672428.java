import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int selected = scanner.nextInt();


        double maxSum = 0;
        int maxIndex = 0;

        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
            if (i < selected) {
                maxSum += input[i];
            }
        }

        double currentSum = maxSum;
        for (int i = 0; i < size - selected; i++) {
            currentSum += input[i + selected];
            currentSum -= input[i];
            if (maxSum < currentSum) {
                maxSum = currentSum;
                maxIndex = i + 1;
            }
        }

        double answer = 0;
        for (int i = maxIndex; i < maxIndex + selected; i++) {
            double current = input[i];
            double sum = (current * (current + 1)) / 2 / current;
            answer += sum;
        }
        System.out.println(answer);
    }
}