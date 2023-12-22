import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String s = null;
    
    public static void main(String[] args) throws Exception {
        s = sc.next();
        String ans = (s.matches(".*C.*F.*")) ? "Yes" : "No";
        System.out.println(ans);
    }
}
