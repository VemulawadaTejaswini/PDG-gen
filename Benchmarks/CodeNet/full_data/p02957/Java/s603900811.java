import java.util.Scanner;

public class Main {
	  public static void main(String[] args ) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int ans = -1;
		
		for(int i = 0;i < 1000000000;i++) {
			if(Math.abs(A-i) == Math.abs(B-i)){
				ans = i;
              break;
			}
		}
		if(ans == -1) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(ans);
		}
	}
}