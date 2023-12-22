public class Main{
	public static void main(String[] args){
		int n = new java.util.Scanner(System.in).nextInt();
		int pow = 1;
		for (int i=1; i<=n; i++){
			pow = (pow*i)%1000000007;
		}
		System.out.println(pow);
	}
}