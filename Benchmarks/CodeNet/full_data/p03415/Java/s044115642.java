import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StringBuffer bf  = new StringBuffer();
		String a=sc.next();
		String b=sc.next();
		String c=sc.next();

		bf.append(a.charAt(0));
		bf.append(b.charAt(1));
		bf.append(c.charAt(2));

		System.out.println(bf);

	}
}