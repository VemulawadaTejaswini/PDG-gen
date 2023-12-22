import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int a = N/100;
		int x = a*100 + a*10 + a;
		
		if(N <= x) {
			System.out.println(x);
		}else {
			a++;
			x = a*100 + a*10 + a;
			System.out.println(x);
		}
		
		
		
		in.close();
	}
}
