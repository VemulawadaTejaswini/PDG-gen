import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ans = 3;
		if(a == b){
			ans--;
		}
		if( b == c){
			ans--;
		}
		if(c == a){
			ans--;
		}
		if( a == b&& b == c){
			ans++;
		}
		System.out.println(ans);
	}
}