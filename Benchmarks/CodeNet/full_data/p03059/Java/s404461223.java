import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double t = sc.nextDouble();
		t = t+0.5;
		int ans = (int)(t/a)*b;
		System.out.print(ans);

	}
}
