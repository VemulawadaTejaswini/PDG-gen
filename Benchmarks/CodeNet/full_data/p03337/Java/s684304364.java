import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println(max(a+b, max(a-b, a*b)));
    }
    public static int max(int x, int y) {
        if(x >= y) return x;
        else return y;
    }
}