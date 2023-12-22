import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        while (true) {
            if (a > 0) {
                a /= b;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
