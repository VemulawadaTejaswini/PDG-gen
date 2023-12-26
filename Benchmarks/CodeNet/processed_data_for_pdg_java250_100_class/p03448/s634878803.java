public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_500 = sc.nextInt();
		int input_100 = sc.nextInt();
		int input_50 = sc.nextInt();
		int input_pay = sc.nextInt();
		int result = 0;
		sc.close();
		for(int i=0;i<=input_500;i++) {
			for(int j=0;j<=input_100;j++) {
				for(int k=0;k<=input_50;k++) {
					if(i*500+j*100+k*50 == input_pay) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
}
