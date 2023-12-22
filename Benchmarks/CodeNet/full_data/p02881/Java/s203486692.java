import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();

        long answer = input - 1;

        if (input % 2 != 0) {
            for (long i = 3; i < input; i += 2) {
                answer = checkIfDivisible(input, answer, i);
            }
        } else {
            for (long i = 2; i < input; i++) {
                answer = checkIfDivisible(input, answer, i);
            }
        }
        System.out.println(answer);
    }

    private static long checkIfDivisible(long inputInt, long answer, long i) {
        if (inputInt % i == 0) {
            long divisible = inputInt / i;
            long possibleAnswer = (i - 1) + (divisible - 1);
            if (possibleAnswer < answer) {
                answer = possibleAnswer;
            }
        }
        return answer;
    }
}