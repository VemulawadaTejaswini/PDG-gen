import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		StringBuffer sb = new StringBuffer(s);
		if(!sb.toString().equals(sb.reverse().toString())){
			System.out.println("No");
			return;
		}
		StringBuffer sb1 = new StringBuffer(s.substring(0,(n-1)/2));
		if(!sb1.toString().equals(sb1.reverse().toString())){
			System.out.println("No");
			return;
		}
		StringBuffer sb2 = new StringBuffer(s.substring((n+1)/2,n));
		if(!sb2.toString().equals(sb1.reverse().toString())){
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}