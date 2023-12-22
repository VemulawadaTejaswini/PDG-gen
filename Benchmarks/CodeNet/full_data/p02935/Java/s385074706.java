import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  List<Double> v = new ArrayList<>();
	  for(int i=0; i<N; i++) {
		  double d = sc.nextDouble();
		  v.add(d);
	  }
	  while(v.size()> 1) {
		  Collections.sort(v);
		  double d1 = v.get(0);
		  double d2 = v.get(1);
		  v.remove(0);
		  v.remove(0);
		  double d3 = (d1 + d2) / 2;
		  v.add(d3);
	  }
	  out.println(v.get(0));
  }
}