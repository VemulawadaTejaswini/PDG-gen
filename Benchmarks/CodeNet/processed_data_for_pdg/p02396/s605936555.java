public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1 ;
		int i = 0 ;
		while ( !(x == 0) ){
			if ( !(i == 0)){
				System.out.println("Case " + i + ": " + x);
			}
			x = sc.nextInt();
			i++;
		}
	}
}
