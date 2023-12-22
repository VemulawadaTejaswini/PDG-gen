import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt(); //問題数
	  int M = sc.nextInt(); //解答した回数
	  int ACcount=0;
	  int WAcount = 0;
	  boolean[] isCorrected = new boolean[N + 10];
	  for(int i=0; i<M; i++) {
		  int p = sc.nextInt();
		  String s = sc.next();
		  
		  if(isCorrected[p] )continue;
		  else if( s.equals("AC")) {
			  ACcount++;
			  isCorrected[p] = true;
		  } else {
			  WAcount++;
		  }
	  }
	  
	  out.println(ACcount + " " + WAcount);
	  
	}
  }	