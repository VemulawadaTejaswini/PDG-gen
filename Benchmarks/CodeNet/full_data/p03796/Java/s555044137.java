public class Main{
	public static void main(String[] args){
		int n = new java.util.Scanner(System.in).nextInt();
		long pow = 1L;
		for (int i=1; i<=n; i++){
			pow = pow * i%1000000007;
		}
		System.out.println(pow);
	}
}