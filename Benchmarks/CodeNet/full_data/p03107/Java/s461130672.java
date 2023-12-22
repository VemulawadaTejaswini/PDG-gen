import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        
        while(s.contains("01") || s.contains("10") ) {
            s = s.replace("01", "");
            s = s.replace("10", "");
        }
        
        System.out.println(n - s.length());
    }
}