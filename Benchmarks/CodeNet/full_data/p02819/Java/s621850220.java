import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		while (!Prime(x)) {
			x++;
		}
		System.out.println(x);
		sc.close();
	}
 
	//素数判定
	public static boolean Prime(int n) {
		if(n==1){
			return false;
		}
		for(long i= 2;i*i<=n;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}