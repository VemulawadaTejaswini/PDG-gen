import java.util.*;
 
public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long n = 0;
            if (x==0) {
              if (a==0) {
                n = 1;
              }
              System.out.println(n);
              return;
            }
            n = (b-a)/x;
 
            if (a % x == 0 || b % x == 0) { n++; }
             // output
            System.out.println(n);
    }
}