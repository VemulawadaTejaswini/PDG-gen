import java.util.*;
public class Main {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		char black = '#';
		char white = '.';
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		char[] inputChars = s.toCharArray();
		
		int noneed = 0;
		for(int i = s.length() -1; i >= 0; i--) {
			if(inputChars[i] == black) {
				noneed++;
			}
			if(inputChars[i] == white) {
				break;
			}
		}
		
		char[] chars = Arrays.copyOf(inputChars, s.length() - noneed);
//		System.out.print("     ");print(chars);
		int ans = 0;
		
		int tempBlack = 0;
		for(int i = 0; i < chars.length - 1; i++) {
			
			if(chars[i] == black) {
				tempBlack++;
			}
			
			
			if (chars[i] == black && chars[i+1] == white) {
				
				if(tempBlack >= (chars.length - i)) {
					//右を黒にする場合
					ans++;
					chars[i+1] = black;
//					System.out.print("b("+tempBlack+")"+(i+1)+":"+ chars.length);print(chars);
				} else {
					//自分を白にする場合
					ans++;
					chars[i] = white;
//					System.out.print("w("+tempBlack+")"+i+":"+ chars.length);print(chars);
					for(int j = 0; j < tempBlack; j++) {
						if(chars[i - j]==black && chars[i - j -1] == white) {
							ans++;
							chars[i - j] = white;
//							System.out.print("w("+tempBlack+")"+(i - j)+":"+ chars.length);print(chars);
						}
					}
					tempBlack = 0;
				}
			}
		}
		
		print(chars);
		String reString = "" + ans;
		System.out.println(reString);
		System.out.println("elaps=" + (System.currentTimeMillis() - start));
	}
	
	static void print(char[] chars) {
		for(char c: chars) {
			System.out.print(c);
		}
		System.out.println();
	}
}