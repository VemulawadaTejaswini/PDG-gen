public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X =scanner.nextInt();
		int Y =scanner.nextInt();
		int Z =scanner.nextInt();
		int A = X ;
		int B = Y ;
		int C = Z ;
		int t ;
		t=  A ;
		A = B ;
		B = t ;
	    t = A ;
		A = C ;
		C = t ;
		System.out.println( A + " " + B + " " + C );
    }
}
