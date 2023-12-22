import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        String t = scan.next();
        String u = scan.next();
        
        if(s.charAt(s.length()-1) == t.charAt(0) && t.charAt(t.length()-1) == u.charAt(0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}