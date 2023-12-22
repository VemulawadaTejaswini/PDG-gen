import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int ca = a - Math.floor(a/c) - Math.floor(a/d) + Math.floor(a/(c*d));
        int cb = b - Math.floor(b/c) - Math.floor(b/d) + Math.floor(b/(c*d));
 
        System.out.println( cb-ca );
 
    }
}