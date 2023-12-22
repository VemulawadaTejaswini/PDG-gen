import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//boolean[] flag = new boolean[3];
		int cnt = 0;
		
		int []count = new int[3];
		
		for(int i = 0; i < 3; i++) {
			count[i] = stdIn.nextInt();
		}
		
		Arrays.sort(count);
		
		for(int i = 0; i < 2; i++) {
			if(count[i]==count[i+1]) {
				cnt++;
			}
		}
		if(cnt==1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
