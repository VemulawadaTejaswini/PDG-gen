public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		int base = sc.nextInt();  
		int count = 0;  
		while(n > 0) {  
			n = n/base;
			count++;
		}
		System.out.print(count);
	}
}
