import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] days = new int[m];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            days[i] = sc.nextInt();
            sum += days[i];
        }
        if (n < sum) System.out.println("-1");
        else System.out.println(n - sum);
        
    }
}