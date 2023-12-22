import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		
		int left = in.nextInt();
		int center = in.nextInt();
		int ans = 0;
		for(int i=2; i<n; i++) {
			int right = in.nextInt();
			if(Math.min(left, Math.min(center, right))!=center && Math.max(left,  Math.max(center, right))!=center) {
				ans++;
			}
			left = center;
			center = right;
		}
		System.out.println(ans);
		
		
		in.close();
	}
}
