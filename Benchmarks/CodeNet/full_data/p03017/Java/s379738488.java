import java.util.Scanner;

public class Main{

	static boolean ans = false;
	static boolean ansAB = false;
	static boolean ansAC = false;
	static boolean ansBD = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		String t = sc.next()+"________";
		sc.close();
		char[] S = t.toCharArray();

		Main m = new Main();
		boolean ans = false;

		m.searchAB(A-1,B-1,S,C-1,D-1);
		m.searchAC(A-1,B-1,S,C-1,D-1);
		m.searchBD(A-1,B-1,S,C-1,D-1);
		//System.out.println(ansAB+" "+ansAC+" "+ansBD);
		if(ansAB&&ansAC&&ansBD) {
			ans = true;
		}
		m.searchAB(A-1,B-1,S,C-1,D-1);
		m.searchBD(A-1,B-1,S,C-1,D-1);
		m.searchAC(A-1,B-1,S,C-1,D-1);
		if(ansAB&&ansAC&&ansBD) {
			ans = true;
		}
		if(ans){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
	void searchAB(int posA,int posB,char[] S,int C,int D){

		if(posA==posB) {
			ansAB = true;
			return;
		}else if(S[posA]=='_') {
			return;
		}else {
			if(posA<=posB){
				if(S[posA+1]!='#'){
					searchAB(posA+1,posB,S,C,D);
				}
				if(S[posA+2]!='#'){
					searchAB(posA+2,posB,S,C,D);
				}
				return;
			}else {
				return;
			}
		}
	}
	void searchAC(int posA,int posB,char[] S,int C,int D){

		if(posA==C) {
			S[posA] = '#';
			ansAC = true;
			return;
		}else if(S[posA]=='_') {
			return;
		}else {
			if(posA<=C){
				if(S[posA+1]!='#'){
					searchAC(posA+1,posB,S,C,D);
				}
				if(S[posA+2]!='#'){
					searchAC(posA+2,posB,S,C,D);
				}
				return;
			}else {
				return;
			}
		}
	}
	void searchBD(int posA,int posB,char[] S,int C,int D){
		//System.out.println(posB);
		if(posB==D) {
			ansBD= true;
			return;
		}else if(S[posB]=='_') {
			return;
		}else {
			if(posB<=D){
				if(S[posB+1]!='#'){
					searchBD(posA,posB+1,S,C,D);
				}
				if(S[posB+2]!='#'){
					searchBD(posA,posB+2,S,C,D);
				}
				return;
			}else {
				return;
			}
		}
	}
}