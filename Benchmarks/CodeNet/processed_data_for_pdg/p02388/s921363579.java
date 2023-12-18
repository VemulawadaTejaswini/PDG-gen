public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int x = sin.nextInt();
		int ans;
		if(1 <= x && x <= 100){
			ans = x * x * x;
			System.out.println(ans);
		}
	}
}
