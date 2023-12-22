
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int x,y,z;
       x = a;
       a = b;
       y = b;
       b = x;
       z = c;
       a = z;
       c = y;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c); 
    }
}