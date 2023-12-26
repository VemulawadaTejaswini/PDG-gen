public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[] A = new int[N];
			int[] jun= new int[N];
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				jun[A[i]-1]=i+1;
			}
			for(int i =0;i<N;i++) {
			System.out.print(jun[i]);
			System.out.print(" ");
			}
		}
	}
}
