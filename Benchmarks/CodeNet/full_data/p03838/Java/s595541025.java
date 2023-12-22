import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X < Y) {
            if (0 <= X) {
                System.out.println(Y-X);
                return;                
            } else if (X < 0 && Y >= 0) {
                if (Math.abs(X) < Math.abs(Y)) {
                    System.out.println(Math.abs(Y) - Math.abs(X) + 1);
                    return;
                } else {
                    System.out.println(Y-X);
                    return;
                }
            } else {
                System.out.println(Y-X);
                return;
            }
        } else {
            if (0 <= Y) {
                System.out.println(X-Y+2);
                return;
            } else if (Y < 0 && X >= 0) {
                if (Math.abs(X) < Math.abs(Y)) {
                    System.out.println(Math.abs(Y) - Math.abs(X) + 1);
                    return;
                } else {
                    System.out.println(Math.abs(X) - Math.abs(Y) + 1);
                    return;
                }
            } else {
                System.out.println(Math.abs(Y) - Math.abs(X) + 2);
                return;
            }
            
        }
    }
    
}