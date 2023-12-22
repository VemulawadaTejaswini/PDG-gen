import java.util.*;
public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // get a integer
            int n = sc.nextInt();
            // get two integers separated with half-width break
            int k = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(n > k)
                System.out.println( (k*x) + ( (n-k) * y ) );
            else
                System.out.println(n*x);
    }
}