import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Main m = new Main();
		long sum = 0;
		for(int i = 1;i <= k;i++){
			for(int j = 1;j <= k;j++){
				for(int l = 1;l <= k;l++){
					sum += m.gcd(i,j,k);
				}
			}
		}

		System.out.println(sum);
	}
	int gcd(int a, int b){
		if(b > 0){
			gcd(b,a%b);
		}
		return a;
	}
	int gcd(int a,int b,int c){
		return gcd(gcd(a,b),c);
	}
}