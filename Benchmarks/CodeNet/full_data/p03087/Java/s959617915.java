import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String str = sc.next();
		int[] set = new int[2*Q];
		for(int i=0; i<2*Q; i++) {
			set[i] = sc.nextInt();
		}
		int time = 0;
		for(int i=0; i<2*Q; i=i+2) {
			String sub = str.substring(set[i]-1, set[i+1]);
			int cnt = 0;
			for(int j=0; j<sub.length(); j++) {
				int c = -1;
				c = sub.indexOf("AC");
				if(c!=-1) {
					sub = sub.substring(c+1);
					cnt++;
				}
			}
			if(time == Q) {
				return;
			}else {
				System.out.println(cnt);
			}
		}
		
	}
}
