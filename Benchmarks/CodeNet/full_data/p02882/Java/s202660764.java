
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int li = sc.nextInt();
        double l = (double) li / d;
        double r = 0;
        double delta = Math.PI/2;
        while (delta > 1.0e-8) {
            double hc = h * Math.cos(r);
            double ds = d * Math.sin(r);
            if (hc > ds) {
                double dq = d * Math.cos(r);
                double hq = h * Math.sin(r);
                double du = hc - ds;
                double duq = du * Math.tan(r);
                double duh = du/Math.cos(r);
                double cap = duh * d + (h-duh)*d/2;
                if (cap <= l) {
                    r-=delta;
                    //System.out.println("a:" + cap);
                }else{
                    delta/=2;
                    r+=delta;
                }
            } else {
                double dh = h / Math.tan(r);
                double cap = h * dh / 2;
                if (cap <= l) {
                    r-=delta;
                    //System.out.println("b:" + cap);
                }else{
                    delta/=2;
                    r+=delta;
                }
            }
        }
        System.out.println(r * (180 / Math.PI));
    }
}