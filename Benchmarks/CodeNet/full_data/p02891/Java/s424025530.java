import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();
			char[]s = S.toCharArray();
			long K = scan.nextLong();

			ArrayList<Character>chara = new ArrayList<Character>();
			ArrayList<Integer>inte = new ArrayList<Integer>();

			Runlength(S,chara,inte);



/*
			for(Character c:chara) {
				System.out.println(c);
			}

			for(Integer i:inte) {
				System.out.println(i);
			}
			*/





			if(chara.size()==1) {
				System.out.println(K*(long)(inte.get(0)/2));
			}else{
				char f = chara.get(0);
				char l = chara.get(chara.size()-1);
				long goukei = 0;
				if(f==l) {
					long F = (long)(inte.get(0)/2);
					long L = (long)(inte.get(inte.size()-1)/2);
					goukei+=F;
					goukei+=L;
					goukei+=(K-1)*(long)((inte.get(0)+inte.get(inte.size()-1))/2);
					long p = 0;
					for(int i = 1;i<inte.size()-1;i++) {
						p+=(long)(inte.get(i)/2);
					}

					p+=(K-1)*p;
					goukei+=p;

					System.out.println(goukei);




				}else {

					for(Integer i:inte) {
						goukei+=(long)(i/2);
					}


					goukei+=(K-1)*goukei;
					System.out.print(goukei);

				}

			}





		}


	}

	//ランレングス圧縮　
	//必ず２個配列用意するように。


	private static void Runlength(String S,ArrayList<Character> chara,ArrayList<Integer>inte) {

		char[]s = S.toCharArray();

		char mem = s[0];
		int count = 1;
		for(int i = 1;i<s.length;i++) {
			if(s[i]==mem) {
				count++;
				if(i==s.length-1) {
					chara.add(s[i-1]);
					inte.add(count);
				}
			}else if(s[i]!=mem) {
				chara.add(s[i-1]);
				inte.add(count);
				mem=s[i];
				count = 1;
				if(i==s.length-1) {
					chara.add(s[i-1]);
					inte.add(count);
				}
			}

		}

	}




}
