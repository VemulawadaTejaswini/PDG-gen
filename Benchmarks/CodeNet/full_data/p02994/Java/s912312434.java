import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //りんごの個数
		int l = stdIn.nextInt(); 
		
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		int index = 0;
		int[] flavor = new int[n];
		
		for(int i = 0; i < n; i++) {
			cnt += l+i;
			int abs = Math.abs(l+i);
			flavor[i] = l+i;
			
			if(min > abs) {
				min = abs;
				index = i; 
			}
			
			
		}
		int ans = cnt-flavor[index];
		System.out.println(ans);
	}

}
