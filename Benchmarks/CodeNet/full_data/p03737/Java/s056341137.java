
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String ans = null;
        for(int i = 0; i < 3; i++){
            String s = sc.next();
            ans += s.charAt(0);
        }
        System.out.println(ans.toUpperCase());
    }
}