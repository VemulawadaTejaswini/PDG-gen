import java.util.*;

public class D2{

    static double x;

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		x = sc.nextDouble();

        double ok = Math.PI / 2.0;
        double ng = 0;
        int count = 0;
        for(int i = 0; i < 27 ; i++){
            double mid = (ok + ng) / 2.0;
            if(f(a, b, mid) < x) ok = mid;
            else ng = mid;
        }

        System.out.println(Math.toDegrees(ok));
    }

    static double f(double a, double b, double t){

        if(t > Math.PI / 2.0){
            return 0.0;
        }
        double ans;
        if(x >= a * a * b / 2){
            ans = a * a * b - a * a * a * Math.tan(t) / 2.0;
        }else{
            ans = a * b * b / Math.tan(t) / 2.0;
        }

        return ans;

    }

}
