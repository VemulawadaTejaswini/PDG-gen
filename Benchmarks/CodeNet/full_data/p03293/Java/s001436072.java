import java.util.Scanner;
public class Main { //B

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int l = S.length();

		char[] SS = new char[l*2];
		char[] TT = new char[l*2];

		for(int i=0; i<l; i++) {
			SS[i] = S.charAt(i);
			SS[l+i] = S.charAt(i);
			TT[i] = S.charAt(i);
			TT[l+i] = T.charAt(i);
		}

		int judge1 = 0;
		for(int j=0; j<l; j++) {
			int judge2 = 0;
			for(int k=0; k<l; k++) {
				//int judge2 = 0;
				if(SS[k] == TT[k+j]) {
					judge2 += 1;
				}
			}if(judge2 == l) {
				judge1 += 1;
			}
		}

		//System.out.println(judge1);

		if(judge1 == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}


	}

}
