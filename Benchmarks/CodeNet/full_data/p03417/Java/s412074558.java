import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tate = Integer.parseInt(sc.next());
        int wide = Integer.parseInt(sc.next());
        if(tate==1&&wide==1) {
            System.out.println(1);
            return;
        }
        if(tate==1) {
            System.out.println(wide-2);
            return;
        }
        if(wide==1) {
            System.out.println(tate-2);
            return;
        }
        int a=tate-2;
        int b=wide-2;
        System.out.println(a*b);
    }
}
