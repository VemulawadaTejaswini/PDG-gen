import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        
        int max = 0;
        if (Math.max(a, b) == a && Math.max(a, c) == a) {
        	max = a;
        	a = 0;
        } else if (Math.max(a, b) == b && Math.max(b, c) == b) {
        	max = b;
        	b = 0;
        } else {
        	max = c;
        	c = 0;
        }
        
        long newK = (long) Math.pow(2,k);
        
        
        System.out.println(a + b + c + (max * newK));
    }
    
}