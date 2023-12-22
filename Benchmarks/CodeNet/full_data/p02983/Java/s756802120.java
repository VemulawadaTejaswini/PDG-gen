import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int p = 2019;
		
		boolean flag1 = false;
		int L = l % p;
		int R = r % p;
		if(R - L <= 0 && l != r)
			flag1 = true;
		if(flag1)
			System.out.println(0);
		else {
			int min = 2019;
			for(int i = L ; i <= R ; i++) {
				for(int j = i; j <= R; j++) {
					int lr = (i * j) % p;
					min = Math.min(min, lr);
				}		
			}
		System.out.println(min);
		
		}
	}

}
