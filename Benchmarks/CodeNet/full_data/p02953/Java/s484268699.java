import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int max = 0;
		boolean flag = true;
		
		for(int i=0; i<N ; i++) {
			int p = sc.nextInt();
			if(max - p >= 2) {
				flag = false;
				break;
			}
			if(max - p == 1) {
				// 何もしない
				continue;
			}
			max = p;
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();	
	}

}