import java.util.Scanner;

public class Main {

    private static int[] finalCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        char[] chars = line.toCharArray();
        finalCount = new int[chars.length];
        for (int i=0; i<chars.length; i++) {
            finalCount[i] = 0;
        }

        int initialPosition = 0;
        while (initialPosition < chars.length) {
            initialPosition = process(initialPosition, chars);
        }

        for (int i=0; i<chars.length; i++) {
            System.out.print(finalCount[i]);
            if (i != chars.length-1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }

    private static int process(int initialPosition, char[] chars) {
        int currentSectionCount = 0;
        int nextStopLeftPosition = 0;
        int nextStopRightPosition = 0;
        int nextSectionStartPosition = chars.length;

        for (int i=initialPosition; i<chars.length; i++) {
            // chars[initialPosition] must be 'R'.
            if (chars[i] == 'L') {
                nextStopLeftPosition = i-1;
                nextStopRightPosition = i;
                break;
            }
        }

        for (int i=nextStopRightPosition; i<chars.length; i++) {
            if (chars[i] == 'R') {
                nextSectionStartPosition = i;
                break;
            }
        }

        for (int i=initialPosition; i<nextSectionStartPosition; i++) {
            if ((nextStopLeftPosition - i) % 2 == 0) {
                finalCount[nextStopLeftPosition]++;
            } else {
                finalCount[nextStopRightPosition]++;
            }
        }

        return nextSectionStartPosition;
    }

}
