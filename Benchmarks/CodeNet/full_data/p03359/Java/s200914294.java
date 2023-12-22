import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;
		int k = sc.nextInt();
		
		d=a;
		if(a<=b){
			d=b;
		}
		if(b<=c && a<=c){
			d=c;
		}
		System.out.println((a+b+c-d)+(2*k)*d);
		
	}
}