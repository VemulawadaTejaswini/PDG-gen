import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println(n-sum < 0 ? -1 : n-sum);
        sc.close();

    }

}
