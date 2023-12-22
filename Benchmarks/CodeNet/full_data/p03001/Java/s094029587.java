
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        double w = stdIn.nextDouble();
        double h = stdIn.nextDouble();
        double x = stdIn.nextDouble();
        double y = stdIn.nextDouble();
        System.out.println(w*h/2 + " "+ (x == w/2 && y == h/2 ? 1 : 0));
    }
}
