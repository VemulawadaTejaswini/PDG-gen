import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a,b,c;
        
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        
        if(a == b) System.out.println(c);
        else if(b == c) System.out.println(a);
        else System.out.println(b);
        
        sc.close();
    }
}