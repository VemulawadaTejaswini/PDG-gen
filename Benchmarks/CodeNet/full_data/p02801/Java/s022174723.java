import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] c = a.toCharArray();
        c[0] += (char)1;
        System.out.println(c);
        
    }
}
