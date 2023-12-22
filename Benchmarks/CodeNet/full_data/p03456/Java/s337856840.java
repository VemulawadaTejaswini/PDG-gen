import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c= 0;
		//aとbを合成してcを確定
		if(b == 100){
			c = a*1000 +b;
		}
		else if(b>=10){
			c = a*100+b;
		}
		else {
			c =a*10+b;
		}
		//cの平方根を１未満になるまでディクリメントして０になっているか判定する。
		double d= Math.sqrt(c);
		while(d>=1) {
			d = d-1;
		}
		if(d==0.0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
