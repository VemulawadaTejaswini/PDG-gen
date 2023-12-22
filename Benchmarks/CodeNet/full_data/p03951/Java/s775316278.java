import java.util.*;
//import java.awt.*;
//import static java.lang.System.*;
//import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        int a=2*n;
        for (int i = 0; i <= n; i++) {
            String p=s.substring(n-i,n);
            String q=t.substring(0,i);
            a=Math.min(2*n-i,a);
        }
        System.out.println(a);
    }
}