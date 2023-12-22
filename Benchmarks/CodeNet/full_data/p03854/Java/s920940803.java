import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		StringBuilder[] sb = new StringBuilder[] {new StringBuilder("dream"),new StringBuilder("dreamer"),new StringBuilder("erase"),new StringBuilder("eraser")};
		
		for(int i = 0; i < sb.length; i++) {
			sb[i] = sb[i].reverse();
		}
		
		String s2 = stdIn.next();
		
		StringBuilder s1 = new StringBuilder(s2);
		String s = s1.reverse().toString();
		
		
		boolean flag = true;
		
		
	Outer:	for(int i = 0; i < s.length();) {
			boolean flag2 = false; //4個の文字列のうちあてはまるものはあるか
			
			//この部分キモイ
			if(s.length() - i == 5) {
				if(s.substring(i,s.length()).equals("dream") || s.substring(i,s.length()).equals("erase")) {
					flag2 = true;
					break Outer;
				}
			}
			if(s.length() - i == 6) {
				if(s.substring(i,s.length()).equals("eraser")){
					flag2 = true;
					break Outer;
				}
			}
		
			
			for(int j = 0; j < 4; j++) {
				String d = sb[j].toString();
				
	
				if(s.substring(i,i+d.length()).equals(d)) { //あてはまった
					flag2 = true;
					i += d.length();
				}
			}
	
			
			if(!flag2) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
