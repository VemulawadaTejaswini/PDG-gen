import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kindsOfFlowers = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int forCount = kindsOfFlowers - 1;
        int answer = forCount * (forCount + 1) * (forCount + 2) / 6;

        if (a != 1 && b != 1) {
            answer += kindsOfFlowers;
        }

        if (a != 1) {
            answer -= countForOneCombination(kindsOfFlowers - a + 1);
        }
        if (b != 1) {
            answer -= countForOneCombination(kindsOfFlowers - b + 1);
        }
        System.out.println(answer);
    }

    private static double countForOneCombination(int i) {
        return (i * (i + 1)) / 2;
    }
}