import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                long q = sc.nextLong();
                long h = sc.nextLong();
                long s = sc.nextLong();
                long d = sc.nextLong();
                long n = sc.nextLong();
                sc.close();
                long a = Math.min(q * 4 , Math.min(h * 2 , s));
                long b = Math.min(d , 2 * a);
                long yono = n / 2 * b + (n % 2) * a;
                System.out.println(yono);
        }
}
//にわとりになりたい