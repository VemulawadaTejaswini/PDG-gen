public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x;	
		int count;	
		StringBuilder sb = new StringBuilder();
		while (true) {
			count=0;
			n=sc.nextInt();
			x=sc.nextInt();
			if(n==0 && x==0){
				break;
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					for (int j2 = 1; j2 <= n; j2++) {
						if(i != j && j!= j2 && j2 != i){
							if(i+j+j2 == x){
								count++;
							}
						}
					}
				}
			}
			count/=6;
			System.out.println(count);
		}
	}
}
