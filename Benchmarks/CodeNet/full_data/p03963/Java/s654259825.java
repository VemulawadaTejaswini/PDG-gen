import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		long ans = (long)b * (long)Math.pow(b-1,(n-1));
		System.out.println(ans);
	}
}