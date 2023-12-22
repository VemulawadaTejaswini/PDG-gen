import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double x = (double) n / (1.08);
        boolean bl = true;
        if ((int) (x + 0.5) != (int) (x))
            bl = false;
        if ((int) x * 1.08 == n) {
            System.out.println((int) (x + 0.5));
            System.exit(0);
        }
            if (!bl) {
                if ((int)((int) (x + 1) * 1.08) == n) {
                    System.out.println((int) (x + 1));
                    System.exit(0);
                } 
            }
            else{
                if ((int)((int) (x - 1) * 1.08) == n) {
                    System.out.println((int) (x - 1));
                    System.exit(0);
                } 
            }
        
        System.out.println(":(");
        s.close();
    }
}