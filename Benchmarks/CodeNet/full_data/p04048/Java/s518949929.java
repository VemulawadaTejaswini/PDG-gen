import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0,x=0;
        if(scan.hasNext())
            n=scan.nextInt();
        if(scan.hasNext())
            x=scan.nextInt();
        double l;
        if(n!=2*x) {
            double p = x / ((double)(n - 2 * x));
            l = x + (n - x) + x + x + (2 * p - 1) * (n - 2 * x);
        }else{
            l = x*3;
        }
        System.out.println(l);

    }

}
