import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		sc.close();
		
		int k=10;
		if(a%10 != 0) {k = Math.min(k, a%10);a=(a/10+1)*10;}
		if(b%10 != 0) {k = Math.min(k, b%10);b=(b/10+1)*10;}
		if(c%10 != 0) {k = Math.min(k, c%10);c=(c/10+1)*10;}
		if(d%10 != 0) {k = Math.min(k, d%10);d=(d/10+1)*10;}
		if(e%10 != 0) {k = Math.min(k, e%10);e=(e/10+1)*10;}
		k = 10-k;
		
		System.out.println(a+b+c+d+e-k);
		

	}

}
