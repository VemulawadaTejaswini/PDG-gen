import java.util.*;
import java.lang.*;

public class Main {
    
    static int ab;
    static int bc;
    static int ca;
    
    public static void main (String args[]) {
        int ans = 0;

        Scanner sc = new Scanner(System.in);
        ab = sc.nextInt();
        bc = sc.nextInt();
        ca = sc.nextInt();
        
        ans = ab * bc / 2;

        System.out.println(ans);
    }
    

}
