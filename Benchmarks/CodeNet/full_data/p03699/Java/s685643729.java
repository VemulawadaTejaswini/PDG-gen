import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] list = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            list[i] += scanner.nextInt();
            sum += list[i];
        }

        Arrays.sort(list);
        int index = 0;
        while (sum % 10 == 0 && index < n) {
            sum -= list[index];
            index++;
        }

        System.out.println(sum);
    }
}