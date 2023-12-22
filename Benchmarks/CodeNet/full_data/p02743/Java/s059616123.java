import java.util.*;
import java.lang.Math;

public class Main {
	static String a;
		  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    double a = sc.nextInt();
		    double b = sc.nextInt();
		    double c = sc.nextInt();
		    
		    c=c-a-b;
		    a=2*Math.sqrt(a*b);
		    if (a<c)
		    	System.out.println("Yes");
		    else 
		    	System.out.println("No");
		  }
		}