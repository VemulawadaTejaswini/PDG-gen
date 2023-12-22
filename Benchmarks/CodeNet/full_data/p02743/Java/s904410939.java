import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  double a = sc.nextInt();
	  double b = sc.nextInt();
	  double c = sc.nextInt();
	  
	  double ar = Math.sqrt(a);
	  double br = Math.sqrt(b);
	  double cr = Math.sqrt(c);
	  
	  if((ar + br) < cr)
		  out.println("Yes");
	  else
		  out.println("No");
  	}
  }	