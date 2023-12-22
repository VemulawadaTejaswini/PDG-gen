import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	double x = sc.nextDouble();

   		double ans = 0.0;
  		double h = x/(a*a);

  		if (h >= b){
    		ans = Math.toDegrees(Math.atan((2*(a*a*b-x))/(a*a*a)));
    	} else {
    		ans = Math.toDegrees(Math.atan(a*b*b/(2*x)));
    	}

    	System.out.println(ans);
    }
}