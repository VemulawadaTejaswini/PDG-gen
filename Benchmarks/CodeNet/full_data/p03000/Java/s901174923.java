
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int count;
        int sum;
        for( count = 0,sum = 0; count < n && sum <= x; count++){
             sum += stdIn.nextInt();
        }
        System.out.println(count);

    }
}
