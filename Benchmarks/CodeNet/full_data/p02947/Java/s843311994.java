
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		String[] str = new String[k];

		for (int i = 0 ; i < k ; i ++) {
			str[i] = sc.next();
			
		}
		for (int i = 0 ; i < k ; i ++) {
			char[] c = str[i].toCharArray();
			Arrays.sort(c);
			str[i] = new String(c);
			
		}
		long answer = 0 ;
		for (int i = 0 ; i < k-1 ; i ++) {
			
			for (int j = i +1 ; j < k ; j ++) {
				
				if (str[i] == str[j]) {
					
					answer++;
				}
				
			}
		}
		System.out.println(answer);
	}
}
