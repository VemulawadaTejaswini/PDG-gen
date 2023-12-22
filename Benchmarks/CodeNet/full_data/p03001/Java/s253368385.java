import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(w == 0 || h == 0) {
            System.out.println(0);
            System.out.println(1);
            return;
        }
        double a1 = x*h;
        double a2 = (w-x)*h;
        double b1 = y*w;
        double b2 = (h-y)*w;
        double c1 = 0;
        double c2 = 0;


        double min1 = (double)Math.min(a1,a2);
        double min2 = (double)Math.min(b1,b2);
        double min3 = 0;
        if(x==0 && y==0) min3 = (double)(h*w)/2;
        else if((w / h == x/y) || (w / h == (w-x)/y)) {
            c1 = h*w/2;
            min3 = c1;
        }

        double ans = Math.max(min1,min2);
        ans = Math.max(ans, min3);
        System.out.println(ans);
        if((min1 == min2 && min1 == ans) || (min1 == min3 && min1 == ans) || (min3 == ans))
            System.out.println(1);
        else System.out.println(0);
    }
}