
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int d = stdIn.nextInt();

        if(n % (2 * d + 1) == 0 )
        System.out.println(n / (2 * d + 1));
        else 
        System.out.println(n / (2 * d + 1) + 1);   
    }
}
