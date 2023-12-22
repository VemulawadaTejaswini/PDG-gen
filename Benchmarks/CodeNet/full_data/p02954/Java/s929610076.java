
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int rLeft = 0;
        int rRight = 0;
        int [] number = new int[s.length()];
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == 'R') {
                if (rLeft == -1) {
                    rLeft = i;
                    rRight = i;
                } else {
                    rRight++;
                }
            } else {
                if (rLeft == -1) {
                    continue;
                }
                int index1 = (rRight - rLeft) % 2 + rRight;
                int index2 = (rRight - rLeft + 1) % 2 + rRight;
                number[index1] += (rRight - rLeft + 1) - (rRight - rLeft + 1) / 2;
                number[index2] += (rRight - rLeft + 1) / 2;


                rLeft = -1;
                rRight = -1;
            }
        }

        int lLeft = s.length() - 1;
        int lRight = s.length() - 1;
        for (int i = s.length() - 2; i >= 0; --i) {
            if (s.charAt(i) == 'L') {
                if (lRight == -1) {
                    lRight = i;
                    lLeft = i;
                } else {
                    lLeft--;
                }
            } else {
                if (lRight == -1) {
                    continue;
                }
                int index1 = lLeft - (lRight - lLeft) % 2 ;
                int index2 = lLeft - (lRight - lLeft + 1) % 2;
                number[index1] += (lRight - lLeft + 1) - (lRight - lLeft + 1) / 2;
                number[index2] += (lRight - lLeft + 1) / 2;

                lLeft = -1;
                lRight = -1;

            }
        }

        for (int i = 0; i < s.length(); ++i) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
