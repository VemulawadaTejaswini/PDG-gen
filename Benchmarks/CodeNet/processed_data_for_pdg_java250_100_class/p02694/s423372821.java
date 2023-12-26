public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();  
		long total = 100L;  
		int count = 0;  
		while(total < x) {
			total *= 1.01;
			count++;  
		}
		System.out.print(count);
	}
}
