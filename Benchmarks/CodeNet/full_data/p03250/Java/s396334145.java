import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int ans = 0;
        if(a == max(a, max(b, c))) ans = a*10+b+c;
        else if(b == max(a, max(b, c))) ans = b*10+a+c;
        else ans = c*10+a+b;
        System.out.println(ans);
    }
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }

}
