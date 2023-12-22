import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 0;
		String ns = String.valueOf(n);
		for(int i=0; i<ns.length(); i++){
			f += Character.getNumericValue(ns.charAt(i));
		}
		System.out.println(n%f==0 ? "Yes" : "No");
	}
}