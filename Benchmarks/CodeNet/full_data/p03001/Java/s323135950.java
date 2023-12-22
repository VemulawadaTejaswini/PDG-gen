import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = Double.parseDouble(sc.next());
        double h = Double.parseDouble(sc.next());
        double x = Double.parseDouble(sc.next());
        double y = Double.parseDouble(sc.next());
        double ans = 0;
        int hukusu = 0;
        if(x/2 == w && y/2 == h) {
            ans = x*h;
            hukusu = 1;
        }else if(2*x == w || 2*y == h) {
            ans = x*h;
            hukusu = 0;
        }else {
            double x2 = w/2;//w-x;
            double y2 = h/2;//h-y;
            double a = (y2-y)/(x2-x);
            double t = y - a*x;
            if((-t)/a >= 0 && (-t)/a <= 0) ans = (((-t)/a) + (w - ((-t)/a))) * h / 2;
            else ans = (t + (h - t)) * w / 2;
        }
        System.out.println(ans+" "+hukusu);
    }
}