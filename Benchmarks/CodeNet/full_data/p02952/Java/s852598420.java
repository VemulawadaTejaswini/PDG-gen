import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = Integer.parseInt(line);

        double logNum = Math.log10(number);
        int numDigit = ((int) logNum) + 1;

        int sum = 0;
        for (int i=1; i<numDigit; i++) {
            if (i % 2 == 1) {
                sum += count(i);
            }
        }
        if (numDigit % 2 == 1) {
            int additional = number - (((int) Math.pow(10, numDigit - 1)) - 1);
            sum += additional;
        }

        System.out.println(sum);
    }

    private static int count(int i) {
        return 9 * ((int)Math.pow(10, i - 1));
    }

}
