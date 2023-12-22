import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] list = new int[9];

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt() / 400;
            if (value >= 8) {
                list[8]++;
            } else {
                list[value]++;
            }
        }

        int minAns = 0;

        for (int i = 0; i < 8; i++) {
            if (list[i] > 0) {
                minAns++;
            }
        }
        int maxAns = minAns;
        if (list[8] > 0) {
            minAns = Math.max(minAns, 1);
            maxAns += list[8];
        }

        System.out.println(minAns + " " + maxAns);
    }
}