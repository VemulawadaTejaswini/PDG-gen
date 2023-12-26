public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		int base = sc.nextInt();  
		int i = 0;
		while(Math.pow(base, i) <= n) {
			i++;
		}
		System.out.print(i);
	}
}
