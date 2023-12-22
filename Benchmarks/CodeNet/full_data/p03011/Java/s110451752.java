import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] input = new int[3];
        input[0] = in.nextInt();
        input[1] = in.nextInt();
        input[2] = in.nextInt();
        Arrays.sort(input);
        System.out.println(input[0] + input[1]);
    }
}