import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kindsOfFlowers = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long answer = 0;
        if (a != 1 && b != 1) {
            answer += kindsOfFlowers;
        }

        for (int i = 2; i <= kindsOfFlowers; i++) {
            double temp = countForOneCombination(kindsOfFlowers - i + 1);
            answer += temp;
        }
        if (a != 1) {
            answer -= countForOneCombination(kindsOfFlowers - a + 1);
        }
        if (b != 1) {
            answer -= countForOneCombination(kindsOfFlowers - b + 1);
        }
        System.out.println(answer);
    }

    private static double countForOneCombination(long i) {
        double pow = Math.pow(10.0, 9.0) + 7;
        return ((i * (i + 1)) / 2.0) % pow;
    }
}