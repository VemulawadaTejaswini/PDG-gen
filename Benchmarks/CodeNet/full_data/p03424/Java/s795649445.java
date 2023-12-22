import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += sc.next();
        }
        
        String ans = "Three";
        if (str.contains("G") && str.contains("W") && str.contains("Y") && str.contains("P")) {
            ans = "Four";
        }
        
        System.out.println(ans);
    }
}
