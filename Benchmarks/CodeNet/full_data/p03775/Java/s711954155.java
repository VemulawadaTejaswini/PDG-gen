import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long n=sc.nextLong(),min=11;
	  String a="",b="";
	  for(int i=1;i<=Math.sqrt(n);i++) {
		  if(n%i==0) {
			 a=String.valueOf(i);
			 b=String.valueOf(n/i);
			 min=Math.min(min, Math.max(a.length(), b.length()));
		  }
	  }
	  System.out.println(min);
  }
	public static List<Long> divisorEnum(long n) {
		List<Long> l=new ArrayList<>();
		for(long i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				l.add(i);
				if(i!=Math.sqrt(n))l.add(n/i);
			}
		}
		l.sort(null);
		return l;
	}
}
