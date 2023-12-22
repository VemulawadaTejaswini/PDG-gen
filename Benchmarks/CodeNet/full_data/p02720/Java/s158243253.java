import java.util.Scanner;
public class Main {
	
	static boolean lunlun(long n) {
		String a = String.valueOf(n);
		
		for(int i = 0; i < a.length()-1; i++) {
			int b = Integer.parseInt(a.substring(i,i+1));
			int c = Integer.parseInt(a.substring(i+1,i+2));
			if(Math.abs(b-c)>1) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int k = stdIn.nextInt();
		long cnt = 0;
		
		long idx = 1;

		while(cnt < k) {
			
			if(lunlun(idx++)) {
				cnt++;
			}
		}
		System.out.println(--idx);
		
	}
}
