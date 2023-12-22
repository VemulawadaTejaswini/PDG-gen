import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = Integer.parseInt(as.next());
		int s = Integer.parseInt(as.next());
		/*
		int a,b;
		int t = 0;
		int x = 0;
		String l = "NO";
		for(int i=0;i<n;i++){
			a = Integer.parseInt(as.next());
			b = Integer.parseInt(as.next());
			try{
				if((b-x)*1.0/(a-t) > s){
					l = "YES";
					break;
				}
			}catch(ArithmeticException e){
			}
			t = a;
			x = b;
		}*/
		System.out.println(n*(n-1)/2+s*(s-1)/2);
	}
}