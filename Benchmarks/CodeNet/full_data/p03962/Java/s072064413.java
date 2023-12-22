import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int []a=new int[3];
		int c=3;
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for (int i = 1; i < a.length; i++) {
			if(a[i]==a[i-1]) {
				c--;
			}
		}
		System.out.println(c);
	}
}