import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int ans = 0;
		
		for(int b=1; b <= X; b++) {
			for(int p = 2; p <= 1000; p++) {
				if(Math.pow(b,p) <= X) {
					ans = (Math.max((int)Math.pow(b,  p), ans));
					}
				}
		
		}
		
		System.out.println(ans);
		

	}
}
