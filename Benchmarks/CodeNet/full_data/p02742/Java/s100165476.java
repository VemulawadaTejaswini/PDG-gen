import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ytotal = scanner.nextInt();
		int xtotal = scanner.nextInt();
		
		if(ytotal%2==0) {
			long ans =0;
			for(int i =0; i<xtotal; i++) {
				int addCount =0;
				if(i%2==0) {
					addCount = ytotal/2;
				}else {
					addCount = ytotal/2;
				}
				ans += addCount;
			}
			System.out.println(ans);
			
		}else {
			long ans =0;
			for(int i =0; i<xtotal; i++) {
				int addCount =0;
				if(i%2==0) {
					addCount = ytotal/2 +1;
				}else {
					addCount = ytotal/2;
				}
				ans += addCount;
			}
			System.out.println(ans);
		}
	}
			
}