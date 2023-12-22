import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];

        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);

        System.out.println((input[1] - input[0]) + (input[2] - input[1]));
    }
}