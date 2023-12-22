import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int tmp;
        tmp = x2 - x1;
        while (tmp-- > 0) {
            System.out.print("R");
        }
        
        tmp = y2 - y1;
        while (tmp-- > 0) {
            System.out.print("U");
        }
        
        tmp = x2 - x1;
        while (tmp-- > 0) {
            System.out.print("L");
        }
        
        tmp = y2 - y1;
        while (tmp-- > 0) {
            System.out.print("D");
        }
        
        System.out.print("D");
        
        tmp = x2 - x1;
        while (tmp-- > 0) {
            System.out.print("R");
        }
        
        System.out.print("RU");
        
        tmp = y2 - y1;
        while (tmp-- > 0) {
            System.out.print("U");
        }
        
        System.out.print("LU");
        
        tmp = x2 - x1;
        while (tmp-- > 0) {
            System.out.print("L");
        }
        
        System.out.print("LD");
        
        tmp = y2 - y1;
        while (tmp-- > 0) {
            System.out.print("D");
        }
        
        System.out.println("R");
    }
}
