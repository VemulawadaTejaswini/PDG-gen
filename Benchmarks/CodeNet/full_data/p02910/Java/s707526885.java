import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char [] a = sc.next().toCharArray();
		int b = 0;
		int c = 0;

		for(int i = 0; i < a.length; i+=2) {
			if(a[i]=='R' || a[i]=='U' || a[i]=='D') {//奇数の条件
				b++;
			}
		}
		for(int i = 1; i < a.length; i+=2) {
			if(a[i]=='L' || a[i]=='U' || a[i]=='D') {//偶数の条件
				c++;
			}
		}

		if(b==0 || c == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}




	}

}
