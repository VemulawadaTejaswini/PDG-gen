import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		String v=s.next();
		boolean f=v.startsWith("A");
		f&=v.substring(2,v.length()-1).chars().filter(o->o=='C').count()==1;
		f&=v.chars().filter(o->'A'<=o&&o<='Z').count()==2;
		
		System.out.println(f?"AC":"WA");
	}
}