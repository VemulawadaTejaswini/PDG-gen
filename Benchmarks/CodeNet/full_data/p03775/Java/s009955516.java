import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long n=sc.nextLong();
	  List<Long> l=divisorEnum(n);
	  long res=0;
	  if(l.size()%2==0) {
		 String s1=String.valueOf(l.get(l.size()/2));
		 String s2=String.valueOf(l.get(l.size()/2-1));
		 res=Math.max(s1.length(), s2.length());
	  }else {
		  String s=String.valueOf(l.get(l.size()/2));
		  res=s.length();
	  }
	  System.out.println(res);

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

