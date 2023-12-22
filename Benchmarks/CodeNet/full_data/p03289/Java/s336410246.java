import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String result = "WA";
		if("A".equals(S.substring(0,1)) &&
				(S.substring(1,2).toLowerCase()).equals(S.substring(1,2)) &&
				(S.substring(S.length()-1)).toLowerCase().equals(S.substring(S.length()-1))) {
			for(int i = 2; i < S.length()-1; i++) {
				if("C".equals(S.substring(i,i+1))) {
					if("WA".equals(result)) {
						result = "AC";
					}else {
						result = "WA";
						break;
					}
				}else if(!(S.substring(i,i+1).toLowerCase()).equals(S.substring(i,i+1))) {
					result = "WA";
					break;
				}
			}
		}
		System.out.println(result);
	}
}
