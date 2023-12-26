public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num_500Coin = scan.nextInt();
		int num_100Coin = scan.nextInt();
		int num_50Coin = scan.nextInt();
		int target_amount = scan.nextInt();
		int n_pattern=0;
		if(num_500Coin<0 || num_500Coin > 50) return;
		if(num_100Coin<0 || num_100Coin > 50) return;
		if(num_50Coin<0 || num_50Coin > 50) return;
		if((num_500Coin + num_100Coin + num_50Coin)<1) return;
		if(target_amount<50 || target_amount>20000) return;
		if(target_amount%50 !=0) return;
		int y;
		for(int i = 0;i <= num_500Coin;i++) {
			y = target_amount - 500*i;
			if(y<0) continue;
			if(y==0) {
				n_pattern++;
				continue;
			}
			for(int j = 0;j <= num_100Coin;j++) {
				int tmp1;
				tmp1 = y - 100*j;
				if(tmp1<0) continue;
				if(tmp1==0) {
					n_pattern++;
					continue;
				}
				for(int k = 0;k <= num_50Coin;k++) {
					int tmp2;
					tmp2 = tmp1 - 50*k;
					if(tmp2<0) continue;
					if(tmp2==0) {
						n_pattern++;
						continue;
					}
				}
			}
		}
		System.out.println(n_pattern);
	}
}
