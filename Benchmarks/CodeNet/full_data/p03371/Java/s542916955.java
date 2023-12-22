import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		int ans=A*X+B*Y;
		int N=X+Y;
		for(int i=0;i<100001;i++){
			ans=Math.min(ans,2*C*i+A*Math.max(0,X-i)+B*Math.max(0,Y-i));
		}
		System.out.println(ans);
	}

}