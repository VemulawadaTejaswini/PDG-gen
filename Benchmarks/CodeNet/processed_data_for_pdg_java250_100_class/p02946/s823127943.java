public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		for(int i=X-K+1;i<X+K;i++) {
			if(i!=X+K-1) {
				System.out.print(i+" ");
			} else {
				System.out.print(i);
				System.out.println();
			}
		}
	}
}
