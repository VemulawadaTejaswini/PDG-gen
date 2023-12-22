import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),count=0;
	  for(int i=1;i<=n;i+=2) {
		  if(divisorEnum(i).size()==8)count++;
	  }

	  System.out.println(count);
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
