import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();

        long answer = input - 1;
        if (input % 2 == 0) {
            answer = getAnswer(input, answer, 2, 1);
        } else {
            answer = getAnswer(input, answer, 3, 2);
        }
        System.out.println(answer);
    }

    private static long getAnswer(long input, long answer, long start, long plus) {
        for (long i = start; i <= input / 2 + 1; i += plus) {
            if (input % i == 0) {
                long divisible = input / i;
                if (divisible < i) {
                    break;
                }
                long possibleAnswer = (i - 1) + (divisible - 1);
                if (possibleAnswer < answer) {
                    answer = possibleAnswer;
                }
            }
        }
        return answer;
    }
}