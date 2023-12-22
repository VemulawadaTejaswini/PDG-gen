import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(1 <= n && n <= 9) {
        	System.out.println(n);
        } else if(10 <= n && n <= 99) {
        	System.out.println(9);
        } else if(100 <= n && n <= 999) {
        	System.out.println(9 + n - 99);
        } else if(1000 <= n && n <= 9999) {
        	System.out.println(909);
        } else if(10000 <= n && n <= 99999) {
        	System.out.println(909 + n - 9999);
        } else {
        	System.out.println(90909);
        }
        
        
        sc.close();
    }
}
