public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		int X = sc.nextInt(); 
		sc.close(); 
		int x = 0; 
		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				for(int c = 0; c <= C; c++) {
					if(500*a + 100*b + 50*c == X) {
						x += 1;
					}
				}
			}
		}
		System.out.println(x);
	}
}
