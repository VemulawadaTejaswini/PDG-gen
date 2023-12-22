import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int p = 2019;
		
		boolean flag1 = false;
		if(r - l >= 2019)
			flag1 = true;
		
		int L = l % p;
		int R = r % p;
		if(R - L <= 0)
			flag1 = true;
		
		if(flag1)
			System.out.println(0);
		else {
			long min = 2019;
			for(int i = l ; i < r; i++) {
				for(int j = i + 1; j <= r; j++) {
					long lr =((long)i * j) % p;
					min = Math.min(min, lr);
				}		
			}
		System.out.println(min);
		
		}
	}

}
