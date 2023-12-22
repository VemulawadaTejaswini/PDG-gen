import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        long syuu=n/(a+b);
        System.out.println(a*syuu+Math.min(a, n-(a+b)*syuu));
        
        
 
    }



}