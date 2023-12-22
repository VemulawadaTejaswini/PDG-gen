import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  long a = Long.parseLong(sc.next());
	  long b = Long.parseLong(sc.next());
	  long c = Long.parseLong(sc.next());
	  long d = Long.parseLong(sc.next());
	  
	  long cd = LCM(c, d);
	  System.out.println(cd);
	  
	  long ac = a/c;
	  long bc = b/c;
	  long ad = a/d;
	  long bd = b/d;
	  long acd = a/(cd);
	  long bcd = b/(cd);
	  
	  long output = (b - a) - ((bc - ac) + (bd - ad) - (bcd - acd));
	  System.out.println(bc - ac);
	  System.out.println(bd - ad);
	  System.out.println(bcd - acd);
	  System.out.println(output);
	  
	  sc.close();
	  
  }
  
  public static long LCM(long c, long d) {
	  long temp;
	  long n = c;
	  n *= d;
	  while((temp = c%d) != 0) {
		  c = d;
		  d = temp;
	  }
	  return n/d;
  }
}
