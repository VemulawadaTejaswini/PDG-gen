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
	public static boolean Prime(int x) {
		if(x==1){
			return false;
		}
		for(int i= 2;i*i<=x;i++) {
			if (x%i==0) {
				return false;
			}
		}
		return true;
	}
}