import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //n桁
		int m = stdIn.nextInt();
		
		boolean[] flag = new boolean[n];
		
		int[] check = new int[n]; //ある桁の場所に同じ数値が入ったかどうかcheck
		
		
		for(int i = 0; i < m; i++) {
			int s = stdIn.nextInt()-1;
			int c = stdIn.nextInt();
			
			if(s==0 && c==0) {
				System.out.println(-1);
				return;
			}
			
			if(flag[s]==true && check[s]!=c) {
				System.out.println(-1);
				return;
			}
			
			flag[s] = true;
			check[s] = c;
			
		}
		if(n==1) {
			if(flag[0]==false) {
				System.out.println(0);
              return;
			}else {
				System.out.println(check[0]);
              return;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(flag[i]==false && i==0) {
				System.out.print(1);
			}else if(flag[i] ==false) {
				System.out.print(0);
			}else {
				System.out.print(check[i]);
			}
		}
		
	}

}
