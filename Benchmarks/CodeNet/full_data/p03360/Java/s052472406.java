import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        if(a == max(a, max(b, c))) a *= 2*k;
        else if(b == max(a, max(b, c))) b *= 2*k;
        else c *= 2*k;
        System.out.println(a+b+c);
    }  
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }
}