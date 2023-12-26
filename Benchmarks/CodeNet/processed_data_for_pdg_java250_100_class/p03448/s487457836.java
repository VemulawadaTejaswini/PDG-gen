public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		int count =0;
		for(int i=0;i<=a;i++) {
			for(int l=0;l<=b;l++) {
				for(int m=0;m<=c;m++) {
					if(x==500*i+100*l+50*m) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
