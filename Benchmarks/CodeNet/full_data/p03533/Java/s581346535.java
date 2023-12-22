import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		char[] son = {'K' , 'I' , 'H' , 'B' , 'R'};
		int cnt = 0;
		boolean a = false;

		Scanner sc = new Scanner(System.in);
		String s = sc.next();


		for( char c : s.toCharArray()){
			if(a){//前の文字がA
				if( c == 'A'){
					System.out.println("NO");
					return;
				}
				
				a = false;


				if( c == 'A' ){//前はAじゃない
					a = true;
					continue;
				}
				
				if(cnt > son.length-1){//文字列超過
					System.out.println("NO");
					return;
				}
				
				if(c == son[cnt]){//正しい子音と一致
					if( son[cnt] == 'R'){//最後の子音
						if( s.indexOf(c) == s.length()-1 ){//R以後に文字がない
							System.out.println("YES");
							return;
						}else{
							System.out.println("NO");
							return;
						}
						
					}
					++cnt;
					a= false;
				}else{
					System.out.println("NO");
					return;
				}
			}
		}

		System.out.println("YES");
	}
}