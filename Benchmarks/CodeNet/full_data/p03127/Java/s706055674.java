import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int ans = 1;
		for(int i = 0;i < n;i++){
			int tmp = sc.nextInt();
			if(i == 0){
				ans = tmp;
			}
			ans = gcd(ans,tmp);
		}
		System.out.println(ans);
	}
	
	static int gcd(int a,int b){
		if(b == 0){
			return a;
		}
		return gcd(b, a%b);
	}
}

