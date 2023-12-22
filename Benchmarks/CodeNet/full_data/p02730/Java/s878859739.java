import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Boolean isOK = (isOk(input)
				&& isOk(input.substring(0,input.length()/2))
				&& isOk(input.substring(input.length()/2+1)));
		String result = isOK ? "Yes" : "No";
		System.out.println(result);
//		System.out.println(isOk(input));
		scanner.close();
	}
	private static Boolean isOk(String s){
		char[] left = s.substring(0, s.length()/2).toCharArray();
		char[] right = s.substring(s.length()/2+1).toCharArray();
		if(s.length() % 2 == 0) right = s.substring(s.length()/2).toCharArray();
		for(int i = 0; i < left.length; i++){
			if(left[i] != right[right.length-1-i]){
				return false;
			}
		}
		return true;
	}
}
