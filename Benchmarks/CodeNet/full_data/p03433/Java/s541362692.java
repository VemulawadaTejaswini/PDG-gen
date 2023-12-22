import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt() , a = s.nextInt();
        if( n % 500 == 0 || n % 500 <= a ) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
