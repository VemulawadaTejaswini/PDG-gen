import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next()) -1;
        long b = Long.parseLong(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        
        long a2 = a -(a/c) -(a/d) +(a / lcm(c, d));
        long b2 = b -(b/c) -(b/d) +(b / lcm(c, d));
        System.out.println(b2-a2);
    }
    
    private static long gcd(long a, long b){
        
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
    
    private static long lcm(long a, long b){
        
        return (a / gcd(a, b)) * b;
    }
}