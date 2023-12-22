import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] ans = new boolean[3];
		for(int i = 0 ; i < 3 ; i++) {
			ans[i] = true;
		}
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		ans[a-1] = false;
		ans[b-1] = false;
		
		for(int i = 0 ; i < 3 ; i++) {
			if(ans[i]) {
				System.out.println(i+1);
			}
		}
	}



}
