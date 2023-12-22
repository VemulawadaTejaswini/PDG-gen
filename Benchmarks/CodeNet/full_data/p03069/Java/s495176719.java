import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		CountNumberOfConversions countNumberOfConversions = new CountNumberOfConversions();
		String key = S.substring(N-1, N);
		String black =countNumberOfConversions.getBlack(key);
		String white =countNumberOfConversions.getWhite(key);
		long pt1 = countNumberOfConversions.getReplaceCount(S,black,white);
		long pt2 = countNumberOfConversions.getReplaceCount(S,white,black);
		System.out.println(Math.min(pt1, pt2));
	}
}

class CountNumberOfConversions {
	public int getReplaceCount(String S,String black,String white) {
		int result = 0;

		boolean conversionFlag = false;

		String[] strArray = S.split("");
		for(String s : strArray) {
			if(!conversionFlag) {
				if(s.endsWith(black)) {
					conversionFlag = true;
				}
			}else if(conversionFlag) {
				if(s.equals(white)) {
					result++;
				}
			}
		}
		return result;
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