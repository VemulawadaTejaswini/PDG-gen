import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= d; j++) {
                int d1 = j / 10;
                int d2 = j % 10;
                
                if (d1 >= 2 && d2 >= 2 && d1 * d2 == i) {
                    // System.out.println(i)
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}