import java.util.*;

public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int n = 0;
            if (x==0) {
              if (a==0) {
                n = 1;
              }
              System.out.println(n);
              return;
            }
            n = (int) (b-a)/x;
            if (a != 0 && a % x == 0) { n++; }
             // output
            System.out.println(n);
    }
}