public class Main {
	public static void main(String[] args) {
		Scanner dd = new Scanner(System.in);
		for(int i = 1; i <= 10000; i++) {
			int x = dd.nextInt();
			if(x != 0) {
				if(x >=1 && x <= 10000) {
					System.out.println("Case " + i + ": " + x);
				}
			} else {
				break;
			}		  
		}
	}
}
