import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int a = stdIn.nextInt();
			if(i != a-1) {
				count++;
			}
		}
		if(count == 0 || count == 2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}