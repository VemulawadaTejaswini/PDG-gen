import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long H = sc.nextLong();
	  long W = sc.nextLong();
	  long count = 0;
	  
	  for(long i=0; i<H; i++) {
		  count += W/2;
		  if(i%2 == 0)
			  count+= W%2;
	  }
	  out.println(count);
  	}
  }	