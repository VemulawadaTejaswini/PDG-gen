
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		
		int n = str.length;
		
		for(int i = 0; i < (n - 1)/2; i++) {
			if((str[i] != str[(n - 1)/2 - i - 1]) ||
					(str[i + (n + 1)/2] != str[n - 1 - i])){
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}

}
