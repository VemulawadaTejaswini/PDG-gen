import java.util.Scanner;

// 4
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double ans = Math.round(N / 1.08);
		if((int)(ans * 1.08) == N)
			System.out.println((int)ans);
		else
			System.out.println(":(");
	}

}
