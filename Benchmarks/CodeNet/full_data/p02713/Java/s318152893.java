import java.util.*;

class Main {
	
	private static int mcd(int a, int b, int c){
		return mcd(a, mcd(b, c));
	}
	
	private static int mcd(int a, int b){
		if(a==1 || b==1) return 1; 
		if(a==b) return a;
		if(a<b) return mcd(a, b-a);
		else return mcd(a-b, b);
	}
	
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long somma = 0;
		for(int a=1; a<=K; ++a)
			for(int b=1; b<=K; ++b)
				for(int c=1; c<=K; ++c) somma+=mcd(a, b, c);
		System.out.print(somma);
	}
}