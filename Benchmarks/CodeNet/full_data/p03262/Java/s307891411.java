import java.util.Arrays;
import java.util.Scanner;


class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[] data = new int[N+1];
		for(int i=0;i < N;i++){
			data[i] = scan.nextInt();
		}
		Arrays.sort(data);

		int key = Math.abs(data[0] - X);
		
		for(int i = 1;i < N;i++){
			key = gcd(key, Math.abs(data[i] - X));
		}
		System.out.println(key);

	}
	
	static int gcd(int p,int q){
		if(q == 0){
			return p;
		}else{
			return gcd(q, p%q);
		}
	}
}
