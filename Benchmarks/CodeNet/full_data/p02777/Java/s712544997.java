import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int n=sc.nextInt();
		int m=sc.nextInt();
		String u=sc.next();
		if(u.contentEquals(s))
			n=n-1;
		else if(u.equalsIgnoreCase(t))
			m=m-1;
		System.out.print(n + " " +m); 
		
	}

}
