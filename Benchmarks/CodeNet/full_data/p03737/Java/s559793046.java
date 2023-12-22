import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        String t = scan.next();
        String u = scan.next();
        
        char S = (s.toUpperCase()).charAt(0);
        char T = (t.toUpperCase()).charAt(0);
        char U = (u.toUpperCase()).charAt(0);
        
        System.out.print(S);
        System.out.print(T);
        System.out.println(U);
    }
}
