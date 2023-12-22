import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 0;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            p = scanner.nextInt();
            sum += p;
            max = Math.max(max, p);
        }
        
        sum = sum - max + max /2;
        System.out.println(sum);
    }
}