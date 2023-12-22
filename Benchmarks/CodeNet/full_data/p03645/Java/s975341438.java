import java.util.Arrays;
import java.util.Scanner;


class Ex implements Comparable<Ex>{
	int a;
	int b;
	public Ex(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public int compareTo(Ex obj) {
		if(this.a < obj.a) {
			return -1;
		}else if(this.a > obj.a){
			return 1;
		}else {
			return 0;
		}
	}
}

public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //島
		int m = stdIn.nextInt(); //定期便 m==1のとき注意？
		Ex[] ex = new Ex[m];


		for(int i = 0; i < m; i++) {
			ex[i] = new Ex(stdIn.nextInt(),stdIn.nextInt());
		}

		Arrays.sort(ex);
		if(m==1) {
			System.out.println("IMPOSSIBLE");
			return;
		}

		/*	for(int i = 0; i < m; i++) {
				System.out.println("ex[i].a:"+ex[i].a+" ex[i].b:"+ex[i].b);
			}
		*/

		for(int i = 0; ex[i].a < 2; i++) {
			if(ex[i].a==1) {
				for(int j = i+1; j < m; j++) {
					if(ex[j].a == ex[i].b && ex[j].b == n) {
						System.out.println("POSSIBLE");
						return;
					}
				}
			}
		}

		System.out.println("IMPOSSIBLE");
	}

}
