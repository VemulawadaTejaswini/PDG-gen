import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
		double n = sc.nextDouble();
	    double  k = sc.nextDouble();
	    sc.close();
	    double p = 0;
	    double cn = 1.0; double cnt = 0;
	   
	   
	  double a = 1.0/n; 
	   for (int i=1; i<n+1; i++) {
		 double t = a; 
		   while(cn<k) {
			      cn= cn*2;
			      t = t*0.5;
			    } 
		   
		   p = p+t ;
	   }
       System.out.println(p);
	}
}