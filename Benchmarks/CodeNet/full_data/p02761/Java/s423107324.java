import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDigits = scanner.nextInt();
        int inputSize = scanner.nextInt();

        int answer = 0;
        int[] ints = new int[numberOfDigits];

        for (int i = 0; i < inputSize; i++) {
            int position = scanner.nextInt();
            int value = scanner.nextInt();
            if (ints[position - 1] != 0 && ints[position - 1] != value) {
                answer = -1;
                break;
            } else {
                ints[position - 1] = value;
            }
        }
        if (answer == -1) {
            System.out.println(answer);
        } else {
            if (numberOfDigits == 1) {
                System.out.println(ints[0]);
            } else if (numberOfDigits == 2) {
                if (ints[0] == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(ints[0] + "" + ints[1]);
                }
            } else {
                if (ints[0] == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(ints[0] + "" + ints[1] + "" + ints[2]);
                }
            }
        }
    }
}