public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int max = 0;
		int min = 0;
		long sum = 0;
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) { 
			x = scan.nextInt();
			if (i == 0) { 
			}
			if (min > x) { 
				min = x;
			}
			if (max < x) { 
				max = x;
			}
			sum += x; 
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
