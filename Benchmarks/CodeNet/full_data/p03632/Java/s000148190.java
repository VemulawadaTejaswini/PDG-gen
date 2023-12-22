import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int t = 0;
        if(a <= c) {
            if(b <= c) {
                t = 0;
            }else {
                t = Math.min(b-c, d-c);
            }
        }else {
            if(d <= a) {
                t = 0;
            }else {
                t = Math.min(d-a, d-c);
            }
        }
        System.out.println(t);
    }
}