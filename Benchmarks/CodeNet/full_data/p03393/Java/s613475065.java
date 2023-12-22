import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String unko=sc.next();
		int[] cg=new int[26];
		for(int i=0; i<26; i++) {
			cg[i]=0;
		}
		for(int i=0; i<unko.length(); i++) {
			cg[unko.charAt(i)-97]++;
		}

		if(unko.length()<26) {		//26文字未満ならまだ出ていない文字のうち、一番若い文字をケツにつければ良い
			for(int i=0; i<26; i++) {
				if(cg[i]==0) {
					unko=unko+((char)(97+i))+"";
					break;
				}
			}
			System.out.println(unko);
		}
		else if(unko.length()==26) {		//26文字の時、zyx…とつづく文字以外は答えが存在する
			if(unko.equals("zyxwvutsrqponmlkjihgfedcba")) {
				System.out.println(-1);
			}
			else {
				//else {
					cg=new int[26];
					for(int i=0; i<26; i++) {
						cg[i]=0;
					}
					boolean Z=false;
					String ans="";
					for(int i=0; i<26; i++) {
						if(!Z) {
							if(unko.charAt(i)=='z') {
								Z=true;
							}
							else {
								ans=ans+unko.charAt(i)+"";
							}
						}
						else if(Z) {
							//System.out.println(unko.charAt(i));
							int a=(unko.charAt(i)-97);
							cg[a]++;
						}
					}
					for(int j=0; j<26; j++) {
						if(cg[j]==1) {
							//System.out.println(j);
							System.out.println(ans+""+((char)(j+97)));
							System.exit(0);
						}
					}
				}
			//}
		}
	}
}