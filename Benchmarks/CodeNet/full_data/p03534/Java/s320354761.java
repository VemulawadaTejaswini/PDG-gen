package CodeFestival2017Finale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		char[] ch = S.toCharArray();

		int a=0;
		int b=0;
		int c=0;
		for (char cs : ch){
			if(cs=='a') a++;
			if(cs=='b') b++;
			if(cs=='c') c++;
		}

		if(S.length()%3==0){
			if(a==b && b==c){
				System.out.println("YES");
				System.exit(0);
			}
		}
		if(S.length()%3==1){
			int tmp = S.length()/3;
			if(a==tmp){
				if(b==tmp || c==tmp){
				System.out.println("YES");
				System.exit(0);
				}
			}
			if(b==tmp && c==tmp){
				System.out.println("YES");
				System.exit(0);
			}
		}
		if(S.length()%3==2){
			int tmp = S.length()/3;
			tmp++;
			if(a==tmp){
				if(b==c && c==tmp-1){
				System.out.println("YES");
				System.exit(0);
				}
			}
			if(b==tmp){
				if(a==c && c==tmp-1){
				System.out.println("YES");
				System.exit(0);
				}
			}
			if(c==tmp){
				if(b==a && a==tmp-1){
				System.out.println("YES");
				System.exit(0);
				}
			}
		}
		System.out.println("NO");
	}

}
