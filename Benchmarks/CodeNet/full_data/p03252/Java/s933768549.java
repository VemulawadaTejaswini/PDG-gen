import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}

	void test(Scanner sc){
		char[] S = sc.nextLine().toCharArray();
		char[] T = sc.nextLine().toCharArray();
		if(S.length==1){
			System.out.println("Yes");return;
		}

		Arrays.sort(S);
		Arrays.sort(T);
		int[] fS = new int[26];
		char p = S[0];
		int c=1;
		int sidx = 0;
		for (int i = 1; i < S.length; i++) {
			if(p==S[i]){
				c++;
			}else{
				fS[sidx++] = c;
				c=1;
			}
			p=S[i];
		}
		fS[sidx++] = c;

		int[] fT = new int[26];
		p = T[0];
		c=1;
		int tidx = 0;
		for (int i = 1; i < T.length; i++) {
			if(p==T[i]){
				c++;
			}else{
				fT[tidx++] = c;
				c=1;
			}
			p=T[i];
		}
		fT[tidx++] = c;

		if(tidx != sidx){
			System.out.println("No");
			return;		
		}
		Arrays.sort(fS, 0, sidx);
		Arrays.sort(fT, 0, tidx);
		for (int i = 0; i < sidx; i++) {
			if(fS[i]!= fT[i]){
				System.out.println("No");
				return;
			}
		}


		System.out.println("Yes");


	}
}
