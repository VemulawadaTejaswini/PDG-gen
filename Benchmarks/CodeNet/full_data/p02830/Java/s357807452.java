import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String str2 = sc.next();
        
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i));
            System.out.print(str2.charAt(i));
        }
    }
}
