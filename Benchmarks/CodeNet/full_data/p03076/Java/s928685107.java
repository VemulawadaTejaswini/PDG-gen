import java.util.Scanner;

public class Main {
	
	static int[] dish = new int[5];
	static int[] last1 = new int[5];
	static String[] dishStr = new String[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			dishStr[i] = (sc.nextLine());
			dish[i] = Integer.parseInt(dishStr[i]);
		}
		
		int lastDish = 0;
		int mini1 = 0;
		//最後に、下一桁の数値が一番小さいdishを頼む(0を除く)
		for(int i=0; i<5; i++) {
			last1[i] = Integer.parseInt(dishStr[i].substring(dishStr[i].length() -1 , dishStr[i].length()));
			if(i == 0) {
				mini1 = last1[i];
				continue;
			}
			if(!(last1[i] == 0) && last1[i] < mini1) {
				mini1 = last1[i];
				lastDish = i;
			}
		}
		
		int ans = 0;
		for(int i=0; i<5; i++) {
			if(i==lastDish) {
				ans += dish[i];
			} else {
				if(last1[i] == 0) {
					ans += dish[i] + last1[i];
				}else {
					ans += dish[i] + 10 - last1[i];
				}
			}
		}
		System.out.println(ans);
	}
}