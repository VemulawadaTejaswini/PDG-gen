import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

//		標準入力6つ
		Scanner s = new Scanner(System.in);
//		System.out.println("N:");
		int n = s.nextInt();

		String[] route = new String[n+1];
//		System.out.println("a:");
		int a = s.nextInt()-1;
//		System.out.println("b:");
		int b = s.nextInt()-1;
//		System.out.println("c:");
		int c = s.nextInt()-1;
//		System.out.println("d:");
		int d = s.nextInt()-1;
//		System.out.println("route:");
		String gan = s.next();

//		routeにするために１文字ずつ区切らないと
		route = gan.split("");

		boolean bool = false;
		if(route[a].equals("#")||route[b].equals("#")||route[c].equals("#") ||route[d].equals("#")
				|| a >= b|| a >= c|| b >= d|| d > n) {
			System.out.println("設定がおかしいです");
		}else {

//		いけるかどうかの判定
			if(c < d) {
				while(b < d) {
					if(route[b+1].equals("#") && route[b+2].equals("#")) {
						break;
					}else if(route[b+1].equals(".")) {
						b +=1;
					}else {
						b +=2;
					}
				}
				while(a < c) {
					if(route[a+1].equals("#")&& route[a+2].equals("#")) {
						break;
					}else if(route[a+1].equals(".")) {
						a +=1;

					}else {
						a +=2;
					}
				}
				if(b == d && a ==c) {
					bool = true;
				}
			}else {
				for(int i = b+1 ; i < d; i++) {
					if(route[i-1].equals(".")&&route[i].equals(".")&&route[i+1].equals(".")) {
						bool = true;

						break;
					}
				}
			}
			if(bool == true) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
