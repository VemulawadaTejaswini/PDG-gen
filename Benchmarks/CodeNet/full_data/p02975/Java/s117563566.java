import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n = stdin.nextInt();
		long rakuda[] = new long[n];

		for(int i = 0; i < n; i++) {
			rakuda[i] = stdin.nextInt();
		}
		int left, right;
		boolean flag = true;
		for(int i = 0; i < n ; i++) {
			left = i - 1;
			right = i + 1;
			if(left == -1) left = n - 1;
			if(right == n) right = 0;
			
			if((rakuda[left] ^ rakuda[right]) != rakuda[i]) {
				flag = false;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

	}
}
