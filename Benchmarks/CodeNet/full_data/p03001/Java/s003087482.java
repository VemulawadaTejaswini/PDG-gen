import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        double ans = 0;
        ans = (double)w * h / 2;
        System.out.print(ans);
        System.out.print(" ");
        if (x * 2 == w && y * 2 == h) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}