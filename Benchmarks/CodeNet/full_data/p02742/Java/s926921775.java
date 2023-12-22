import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long h = stdIn.nextLong();
		long w = stdIn.nextLong();
		
		long cnt = 0;
		
		for(int i = 0; i < h; i ++) {
			if(i%2==0) {
				cnt += (w+1)/2;
			}else {
				cnt += w/2;
			}
			
			
			
		}

		System.out.println(cnt);

	}

}
