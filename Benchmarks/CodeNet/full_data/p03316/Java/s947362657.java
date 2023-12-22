import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        
        if (Integer.parseInt(str) % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
