import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
 
		CountNumberOfConversions countNumberOfConversions = new CountNumberOfConversions();
		int result[] = countNumberOfConversions.getReplaceCount(N,S);
		System.out.println(Math.min(result[0],result[1]));
	}
}
 
class CountNumberOfConversions {
	public int[] getReplaceCount(int N,String S) {
		int countBlack = 0;
		int countWhite = 0;
		String key = S.substring(N-1, N);
		String black =getBlack(key);
		String white =getWhite(key);
		boolean conversionFlag = false;
 
		String[] strArray = S.split("");
		for(String s : strArray) {
			if(!conversionFlag) {
				if(s.endsWith(black)) {
					conversionFlag = true;
					countBlack++;
				}
 
			}else if(conversionFlag) {
				if(s.equals(white)) {
					countWhite++;
				}else {
					countBlack++;
				}
			}
		}
		return new int[] {countWhite,countBlack};
	}
 
	public String getBlack(String key) {
		return checkBlackOrWhite(key,"black");
	}
 
	public String getWhite(String key) {
		return checkBlackOrWhite(key,"white");
	}
 
	public String checkBlackOrWhite(String key,String input) {
		String result = ".";
		if(key.equals("#")) {
			if(input.equals("black")) {
				result="#";
			}
		}else {
			if(!input.equals("black")) {
				result="#";
			}
		}
		return result;
	}
 
}