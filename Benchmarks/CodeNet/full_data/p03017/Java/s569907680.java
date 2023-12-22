import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	int SUNUKE = 100 ;
	int FUNUKE = 200 ;
	int DOT = 0 ;
	int STONE = 1 ;
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String S = sc.next() ;

//		System.out.println("N=" + N);
//		System.out.println("A=" + A);
//		System.out.println("B=" + B);
//		System.out.println("C=" + C);
//		System.out.println("D=" + D);
//		System.out.println("S=" + S);
//

		int cell[] = new int[N + 1] ;
		for(int i = 1 ; i <= N ; i ++) {
			if(i == A) {
				cell[i] = SUNUKE ;
			}else if(i == B) {
				cell[i] = FUNUKE ;
			}else {
				String z = S.substring(i - 1, i ) ;
				if(z.equals(".")) {
					cell[i] = DOT ;
				}else {
					cell[i] = STONE ;
				}
			}

		}

//		String Z = "" ;
//		for(int i = 1 ; i <= N ; i ++) {
//			int x = cell[i];
//			if(x==SUNUKE) {
//				Z += "S" ;
//			}else if(x == FUNUKE) {
//				Z += "F" ;
//			} else {
//				Z += x + "" ;
//			}
//		}
//		System.out.println(Z);

		//BからDまでの間に石が2つ並んでいたらNG
		for(int i = B + 1 ; i <= D; i ++) {
			if((cell[i] == STONE) &&  (cell[i] == cell[i -1])) {
				System.out.println("No");
				return ;
			}
		}
		//ここまでくれば、ふぬけ君はDまで移動できる
		//AからCまでの間に石が2つ並んでいたらNG
		for(int i = A + 1; i <= C; i ++) {
			if((cell[i] == STONE) &&  (cell[i] == cell[i -1])) {
				System.out.println("No");
				return ;
			}
		}
		// C < Dの場合
		if( C < D) {
		} else {// D < Cの場合

			//追い抜けるかどうか？
			//BからCまでの間に、抜けるポイント＝石が連続して3か所以上空いている場所があればOK
			int blank = 0 ;
			boolean check = false ;
			if(cell[B-1] != STONE) {
				blank = 1 ;
			}
			for(int i = B ; i <= D; i ++) {
				if(cell[i] != STONE) {
					blank ++ ;
					if(blank == 3) {
						check = true ;
						break ;
					}
				}else{
					blank = 0 ;
				}
			}
			//追い抜くポイントなしのためNG
			if(!check) {
				if((cell[D-1] != STONE) && (cell[D+1] != STONE)) {
					//Dの手前も後ろも空いていれば、ここで追い抜ける
				}else {
					System.out.println("No");
					return ;
				}
			}
		}

		//ここまでくれば、すぬけ君はCまで移動できる
		System.out.println("Yes");
		return ;
//
//
//
//
//
//
//
//
//		String Z = "" ;
//		for(int i = 1 ; i <= N ; i ++) {
//			int x = cell[i];
//			if(x==SUNUKE) {
//				Z += "S" ;
//			}else if(x == FUNUKE) {
//				Z += "F" ;
//			} else {
//				Z += x + "" ;
//			}
//		}
//		System.out.println(Z);
	}



}
