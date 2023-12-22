import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		 String s = scan.next();
		 StringBuilder sb = new StringBuilder();
		
		int n = s.length();
		
		mojiwa(n,s,1,sb);
		mojiwa(n,s,0,sb);
		
		sb.delete(0, 1);//最初に+を入れてるので消去
		//System.out.println(sb.toString());
		System.out.println(tashizan(sb.toString()));
		
	}
	
	
	public static long tashizan(String s){
		
		int count = 0;
		long kaitou =0;
		
		for(int i =0;i<s.length();i++){
			if(s.substring(i, i+1).equals("+")){
				kaitou += Long.parseLong(s.substring(count, i));

;
				count =i+1;
			}
			
			if(i==s.length()-1){
				kaitou += Long.parseLong(s.substring(count, i+1));

			}
			
			
			
			
			
		}
		
		
		return kaitou;
		
		
		
	}
	
	
	
	
	
	
	
	public static void mojiwa(int N,String S,int count,StringBuilder SB){//文字列の長さ、文字、1か０は+を入れるか入れないか
		if(N==2){
			if(count==1){
				
				System.out.println(S.substring(0,1)+"+"+S.substring(1, S.length()));
				SB.append("+");
				SB.append(S.substring(0,1)+"+"+S.substring(1, S.length()));
				
				
			}else{
				System.out.println(S);
				SB.append("+");
				SB.append(S);
			}
	
		}else{
		
		if(count==1){
			
			String S1 = S.substring(0, N-1)+"+"+S.substring(N-1, S.length());
			mojiwa(N-1,S1,1,SB);//+を入れるパターン
			mojiwa(N-1,S1,0,SB);//入れないパターン
			
			
		}else{
			String S0 = S;
			
			mojiwa(N-1,S0,1,SB);
			mojiwa(N-1,S0,0,SB);
			}
		
		
		
		}
		
		
		
		
	}

}