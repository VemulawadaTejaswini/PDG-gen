import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                total += sum / 2;
                sum = 0;
            } else {
                sum += x;
            }
        }
        total += sum / 2;
     System.out.println(total);
    }
}
