import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();

        long answer = input - 1;
        if (input % 2 == 0) {
            answer = getAnswer(input, answer, 1);
        } else {
            answer = getAnswer(input, answer, 2);
        }
        System.out.println(answer);
    }

    private static long getAnswer(long input, long answer, long minus) {
        int newStart = (int) Math.sqrt(input);
        for (long i = newStart; i > 1; i -= minus) {
            if (input % i == 0) {
                long divisible = input / i;
                long possibleAnswer = (i - 1) + (divisible - 1);
                return possibleAnswer;
            }
        }
        return answer;
    }
}
