import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                long n = sc.nextLong();
                long a = sc.nextLong();
                long b = sc.nextLong();
                sc.close();
                long c = n / (a + b);
                long s = c * a;
                long d = n % (a + b);
        if(d > a){
                s = s + a;
        }else{
                s = s + d;
        }
        System.out.println(s);
        }
}
//鶏になれ