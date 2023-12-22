import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        sc.close();
        
        int max1 = Y;
        if (X<Y) {
            max1 = X;
        }
        int min1 = 0;
        if (N<X+Y) {
            min1 = X+Y -N;
        }
        
        System.out.println(Integer.toString(max1) + " " + Integer.toString(min1));
    }
}