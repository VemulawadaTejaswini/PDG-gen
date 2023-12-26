public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		if(n%k==0)
		{
			System.out.print(n/k);
		}
		else
		{
			System.out.println((n/k)+1);
		}
	}
}
