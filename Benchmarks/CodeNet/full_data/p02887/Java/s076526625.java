import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		StringBuilder result = new StringBuilder();
		result.append(S);
		int count = 1;
		for(int j = 0; j <= result.length(); j++) {
			for(int i = 0; i <= result.length()-2; i++) {
				if(result.substring(i,i+1).equals(result.substring(i+1,i+2))) {
					result.delete(i+1, i+2);
					count++;
					i--;
				}
			}
			if(count == 1) {
				break;
			}
			count = 1;
		}
		System.out.println(result.length());
		sc.close();
	}

}
