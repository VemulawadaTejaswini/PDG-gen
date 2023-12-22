import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
		double n = sc.nextDouble();
	    double  k = sc.nextDouble();
	    double p = 0;
	    sc.close();
	    int cn = 1; int cnt =0;
	   
	    while(cn<k) {
	    	cn = cn*2;
	    	cnt = cnt+1;
	      }
	    
	   for (int i=0; i<n; i++) {
		 double a = 1/n;
		 double b = Math.pow(0.5, cnt-i);
		 double c = a*b;
		 p = p+c;
	   }
    System.out.println(p);
	}

}
