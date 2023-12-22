import java.util.*;
public class Main {
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,min_t,min_b,min;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>b) min_t = b;
        else min_t =a;

        if(c>d) min_b = d;
        else min_b =c;

        min = min_t+min_b;
        System.out.println(min);
    }
}