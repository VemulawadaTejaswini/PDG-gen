import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan  = new Scanner(System.in);
		
		String w = scan.next();
		
		String[] W = new String[w.length()];
		
		for(int i = 0;i<w.length();i++){
			W[i] = w.substring(i, i+1);			
		}
		
		Arrays.sort(W);
		
		StringBuilder SB = new StringBuilder();
		
		for(int i = 0;i<w.length();i++){	
				SB.append(W[i]);//これで昇順の文字完成acda aacdへ
		}
		int onajicount=0;
		
		int dame = 0;
		
		
		for(int i = 0;i<w.length()-1;i++){	
			if(W[i].equals(W[i+1])){//今の文字と次の文字が同じかどうか
				onajicount +=1;
			}else{//次の文字が違う
				if(SB.toString().substring(i-onajicount, i+1).length()%2==0){
					
					
				}else{
					dame = 1;
					
				}
				onajicount =0;
			}
			
			
	}
		
		
		if(dame ==1)
			System.out.println("No");
		else
			System.out.println("Yes");
		
		
		
		
		
		
		
		
		

		
		
	}

}