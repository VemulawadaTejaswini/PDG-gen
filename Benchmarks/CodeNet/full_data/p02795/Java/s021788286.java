import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        
        int big = 0;
        int small = 0;
        if (h > w) {
            big = h;
            small = w;
        } else {
            big = w;
            small = h;
        }
        
        for (int i = 0; i < n; i++) {
            int num = big * i;
            if (num >= n) {
                System.out.println(i);
                return;
            }
        }
        
    }
}
