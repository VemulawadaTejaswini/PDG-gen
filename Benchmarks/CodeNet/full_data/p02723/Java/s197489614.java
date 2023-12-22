import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean m = s.charAt(2) == s.charAt(3);
        boolean n = s.charAt(4) == s.charAt(5);

        if(m && n) System.out.println("Yes");
        else System.out.println("No");
 
    } 
}