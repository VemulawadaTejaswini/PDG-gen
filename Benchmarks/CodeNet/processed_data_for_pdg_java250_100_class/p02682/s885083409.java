public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		int b = sc.nextInt();	
		int c = sc.nextInt();	
		int k = sc.nextInt();	
		int sum = 0;
		if(k>0) {
			for(int i=0; i < a; i++) {
				sum++;
				k--;
				if(k == 0) {
					break;
				}
			}
		}
		if(k>0) {
			for(int i=0; i < b; i++) {
				k--;
				if(k == 0) {
					break;
				}
			}
		}
		if(k>0) {
			for(int i=0; i < c; i++) {
				sum--;
				k--;
				if(k == 0 || k > c) {
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
