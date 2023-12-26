public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int total = 0;
		int N = scan.nextInt(); 
		int M = scan.nextInt(); 
		while(true) {
			if(i == M) break;
			int A = scan.nextInt(); 
			total += A;
			i++;
		}
		if(N >= total) {
			N -= total;
			System.out.println(N);
		} else if(N < total) {
			System.out.println("-1");
		}
	}
}
