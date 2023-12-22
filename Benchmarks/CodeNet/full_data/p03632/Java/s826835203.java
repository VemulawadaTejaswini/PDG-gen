import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int t = b-a;
        if(d<=a) {
            t = 0;
        }else if(c<=a && d<=b) {
            t = d-a;
        }else if(a<=c && d<=b) {
            t = d-c;
        }else if(a<=c && c<=b && b<=d) {
            t = b-c;
        }else {
            t = 0;
        }
        System.out.println(t);
    }
}