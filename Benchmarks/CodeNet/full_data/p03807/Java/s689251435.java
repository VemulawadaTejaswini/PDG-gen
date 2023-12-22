import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        while (n-- > 0) {
            int num = sc.nextInt();
            if (num % 2 == 1) odd++;
        }
        
        if (odd % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
