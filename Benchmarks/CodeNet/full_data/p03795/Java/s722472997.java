public class Main{
	public static void main(String[] args){
		int n = new java.util.Scanner(System.in).nextInt();
		int x = 800*n;
		int y = 200*(n/15);
		System.out.println(x - y);
	}
}