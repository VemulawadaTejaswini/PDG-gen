import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long a = sc.nextInt();
	  long b = sc.nextInt();
	  long c = sc.nextInt();
	  
	  double ar =(long) Math.sqrt(a);
	  double br = (long)Math.sqrt(b);
	  double cr = (long)Math.sqrt(c);
	  
	  if((ar + br) < cr)
		  out.println("Yes");
	  else
		  out.println("No");
  	}
  }	