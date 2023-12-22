
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        double w = stdIn.nextDouble();
        double h = stdIn.nextDouble();
        double x = stdIn.nextDouble();
        double y = stdIn.nextDouble();
        System.out.printf("%.6f %d\n",w*h/2, x == h/2 && y == w/2 ? 1 : 0);
    }
}
