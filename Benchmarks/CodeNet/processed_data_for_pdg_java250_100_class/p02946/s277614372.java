public class Main {
	public static void main(String[] args) {
		Scanner jk = new Scanner(System.in);
		int k = jk.nextInt();
		int x = jk.nextInt();
		int i = x-k+1;
		int j = x+k-1;
		for (i=i; i<=j; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
