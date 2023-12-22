import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 String A  = in.next();
		 
		 if(A.equals("Sunny")){System.out.print("Cloudy");}
		 if(A.equals("Cloudy")){System.out.print("Rainy");}
		 if(A.equals("Rainy")){System.out.print("Sunny");}
	}
}