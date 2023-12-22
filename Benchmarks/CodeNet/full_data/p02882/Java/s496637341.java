import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        sc.close();

        double d = 0.0;
        if (a*a*b/2 > x) {
            d = 90.0-(Math.atan((double)x*2/b/a/b))*180/Math.PI;
        } else if (a*a*b/2 == x) {
            d = (Math.atan((double)a/b))*180/Math.PI;
        } else {
            d = (Math.atan((((double)a*a*b-x)/a/a/a*2)))*180/Math.PI;
        }
        System.out.println(d);
    }
}