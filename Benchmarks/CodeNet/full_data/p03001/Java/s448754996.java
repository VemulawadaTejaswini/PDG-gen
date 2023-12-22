import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        
        int answer2 = 0;
        
        if (x * 2 == w && y * 2 == h) {
            answer2 = 1;
        }
        
        double answer = w / 2 * h;
        
        System.out.println(answer + " " + answer2);
    }
}
