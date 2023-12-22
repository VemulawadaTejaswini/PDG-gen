import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        Arrays.sort(s);

        int total_score = 0;
        for (int i = 0; i < n; i++) {
            total_score += s[i];
        }
        
        if (total_score % 10 != 0) {
            System.out.println(total_score);
        } else {
            for (int i = 0; i < n; i++) {
                int sum = total_score - s[i];
                if (sum % 10 != 0) {
                    System.out.println(sum);
                    return;
                }
            }
            System.out.println("0");
        }
    }
}