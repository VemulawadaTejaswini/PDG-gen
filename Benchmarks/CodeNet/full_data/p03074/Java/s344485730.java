import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int K = scan.nextInt();

			String S = scan.next();
			ArrayList<Character>chara = new ArrayList<Character>();
			ArrayList<Integer>inte = new ArrayList<Integer>();
			Runlength(S,chara,inte);



			long[]s = new long[chara.size()+1];
			for(int i = 0;i<chara.size();i++) {
				s[i+1] = inte.get(i)+s[i];
			}

			for(int i = 0;i<chara.size();i++) {
				//System.out.println(chara.get(i)+" "+inte.get(i));
			}

			long max = 0;
			int R = 0;
			int count =  K;
			int zero =  0;
			for(int L = 0;L<chara.size();L++) {
				if(chara.get(L)=='0')zero = 1;
				if(zero==1&&chara.get(L)=='1') {
					count++;zero=0;
				}
				while(R<chara.size()-1&&count>0) {
					if(chara.get(R)=='0') {
						count--;
						if(count==0) {
							R++;break;
						}
					}
					R++;
				}
				if(chara.get(L)=='1'||L==0||R==chara.size()-1) {
					long ma = s[R+1]-s[L];
					//System.out.println(ma);
					max = Math.max(ma, max);
				}

				//System.out.println(L+" "+R);


			}

			System.out.println(max);





		}


	}




		//ランレングス圧縮　
	//必ず２個配列用意するように。
	/*
	 * (例)
	 * String S = scan.next();
	 * ArrayList<Character>chara = new ArrayList<Character>();
	 * ArrayList<Integer>inte = new ArrayList<Integer>();
	 * Runlength(S,chara,inte)
	 *
	 * */

	private static void Runlength(String S,ArrayList<Character> chara,ArrayList<Integer>inte) {

		char[]s = S.toCharArray();
		char mem =s[0];
		int count = 0;
		for(int i = 0;i<s.length;i++) {
			if(s[i]==mem) {
				count++;
				if(i==s.length-1) {
					chara.add(s[i]);
					inte.add(count);
				}
			}else if(s[i]!=mem) {
				chara.add(s[i-1]);
				inte.add(count);
				mem=s[i];
				count = 1;
				if(i==s.length-1) {
					chara.add(s[i]);
					inte.add(count);
				}
			}
		}


	}




}
