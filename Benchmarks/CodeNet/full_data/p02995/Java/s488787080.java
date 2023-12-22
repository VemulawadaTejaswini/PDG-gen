import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int ca = a - (int)Math.floor(a/c) - (int)Math.floor(a/d) + (int)Math.floor(a/(c*d));
        int cb = b - (int)Math.floor(b/c) - (int)Math.floor(b/d) + (int)Math.floor(b/(c*d));
 
        System.out.println( cb-ca );
 
    }
}