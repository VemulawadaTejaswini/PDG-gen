public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;				
		long k;						
		long[] points = new long[100000];	
		int question;			
		num = scan.nextInt();
		k = scan.nextLong();
		question = scan.nextInt();
		k -= question;		
		for(int i = 0; i < num; i++) {
			points[i] = k;
		}
		for(int i = 0; i < question; i++) {
			points[scan.nextInt() - 1] += 1;
		}
		for(int i = 0; i < num; i++) {
			if(points[i] >= 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
