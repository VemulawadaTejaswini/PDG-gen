import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String ans = "x";
        
        for(int i = 1; i < num.length(); i++){
            ans = ans + "x";
        }
        
        System.out.println(ans);
    }
}