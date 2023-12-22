
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        int right = num.length / 2;
        int left = right - 1;
        if (num[right] == num[left]) {
           System.out.println(0);
           return;
        }
        System.out.println((num[right] - num[left]));
    }

}
